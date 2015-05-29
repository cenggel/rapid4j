package com.v5ent.rapid4j.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.v5ent.rapid4j.web.model.User;
import com.v5ent.rapid4j.web.service.MenuService;
import com.v5ent.rapid4j.web.service.UserService;

/**
 * 客户控制器
 * 
 * @author Mignet
 * @since 2014年5月28日 下午3:54:00
 **/
@RestController  
@RequestMapping(value="/accounts")  
public class AccountsController {

    @Resource
	private UserService userService;
    
    @Resource
	private MenuService menuService;

    @RequestMapping(value="Login",  method=RequestMethod.POST , consumes={MediaType.APPLICATION_JSON_VALUE},produces={MediaType.APPLICATION_JSON_VALUE}) 
    public Map Login(@RequestBody User u){
		//
//		u.setUserid(userService.save(u));
    	System.out.println(u.getUsername());
		User ur = userService.selectByUsername(u.getUsername());
		Map m = new HashMap();
		if(ur!=null){
			m.put("MenuItems",  menuService.selectByAuth(true));
			m.put("IsAuthenicated",  true);
			m.put("User",  ur);
		}else{
			//if error
			m.put("ReturnMessage","用户名或者密码错误！");
			m.put("ValidationErrors","用户名或者密码错误！");
		}
		return m;
	}
    
    @RequestMapping(value="GetUser/{id}",  method=RequestMethod.GET , produces={MediaType.APPLICATION_JSON_VALUE}) 
    public Map getUserById(@PathVariable("id") Long id) {
		User ur = userService.selectById(id);
		Map m = new HashMap();
		m.put("IsAuthenicated",  true);
		m.put("User",  ur);
		return m;
	}

    @RequestMapping(value="RegisterUser",  method=RequestMethod.POST , consumes={MediaType.APPLICATION_JSON_VALUE},produces={MediaType.APPLICATION_JSON_VALUE})
    public Map create(@RequestBody User user) {
		userService.insert(user);
		User ur = userService.selectByUsername(user.getUsername());
		Map m = new HashMap();
		m.put("MenuItems",  menuService.selectByAuth(true));
		m.put("IsAuthenicated",  true);
		m.put("User",  ur);
		return m;
	}

    @RequestMapping(value="UpdateUser",  method=RequestMethod.POST ,consumes={MediaType.APPLICATION_JSON_VALUE}, produces={MediaType.APPLICATION_JSON_VALUE})
    public Map update(@RequestBody User user) {
		int len = userService.update(user);
		Map m = new HashMap();
		m.put("ReturnMessage", len==1?"ok":"update error");
		return m;
	}
}
