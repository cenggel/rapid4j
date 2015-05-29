package com.v5ent.rapid4j.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.v5ent.rapid4j.web.service.MenuService;
import com.v5ent.rapid4j.web.service.UserService;

/**
 * 客户控制器
 * 
 * @author Mignet
 * @since 2014年5月28日 下午3:54:00
 **/
@RestController  
@RequestMapping(value="/main")  
public class AuthController {

    @Resource
    private MenuService menuService;

    @RequestMapping(value="InitializeApplication/{isAuthenicated}",  method=RequestMethod.GET , produces={MediaType.APPLICATION_JSON_VALUE}) 
	public Map initializeApplication(@PathVariable(value = "isAuthenicated") String isAuthenicated){
		System.out.println("Application has been initialized.isAuthenicated:"+isAuthenicated);
		Map m = new HashMap();
		if(isAuthenicated==null){
			isAuthenicated ="false";
		}
		boolean IsAuthenicated =Boolean.parseBoolean(isAuthenicated);
		m.put("MenuItems",  menuService.selectByAuth(IsAuthenicated));
		m.put("IsAuthenicated",  isAuthenicated);
		//if error
		//m.put("ReturnMessage","Null error");
		return m;
	}
    
    @RequestMapping(value="AuthenicateUser",  method=RequestMethod.GET , produces={MediaType.APPLICATION_JSON_VALUE}) 
    public Map AuthenicateUser(){
		//
		Map m = new HashMap();
		m.put("IsAuthenicated",  "true");
		boolean IsAuthenticated = true;
		return m;
	}

    @RequestMapping(value="Logout",  method=RequestMethod.GET , produces={MediaType.APPLICATION_JSON_VALUE})
	public Map Logout(){
		//
		Map m = new HashMap();
		m.put("IsAuthenicated",  "false");
		//FormsAuthentication.SignOut();
        boolean IsAuthenicated = false;
		return m;
	}

}
