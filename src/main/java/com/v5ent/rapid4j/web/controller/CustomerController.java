package com.v5ent.rapid4j.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.v5ent.rapid4j.core.feature.orm.mybatis.Page;
import com.v5ent.rapid4j.web.model.Customer;
import com.v5ent.rapid4j.web.model.CustomerExample;
import com.v5ent.rapid4j.web.model.CustomerExample.Criteria;
import com.v5ent.rapid4j.web.service.CustomerService;

/**
 * 客户控制器
 * 
 * @author Mignet
 * @since 2014年5月28日 下午3:54:00
 **/
@RestController  
@RequestMapping(value="/customers")  
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @RequestMapping(value="GetCustomer/{customerID}",  method=RequestMethod.GET , produces={MediaType.APPLICATION_JSON_VALUE}) 
	public Map GetCustomer(@PathVariable("customerID") String customerID){
		//
		Customer customer = customerService.selectById(customerID);
		Map m = new HashMap();
		m.put("customersWebApiModel.Customer",  customer);
		m.put("Customer",  customer);
		m.put("customersWebApiModel.IsAuthenicated",  true);
		m.put("ReturnMessage","查询成功！");
		//if error
		if(customer==null){
			m.put("ReturnMessage","Null error");
		}
		return m;
	}
    
    @RequestMapping(value="/GetCustomers",   method=RequestMethod.GET)  
    public Map CustomerInquiry(@RequestParam("sortexpression")  String sortexpression,
    		@RequestParam("customercode")  String customercode,
    		@RequestParam("companyname")  String companyname,
    		@RequestParam("sortdirection")  String sortdirection,
    		@RequestParam("currentpagenumber")  int currentpagenumber,
    		@RequestParam("pagesize")  int pagesize
			) {
		
		//条件查询
		if(pagesize<=0){
			pagesize = 15;
		}
		CustomerExample example = new CustomerExample();
		CustomerExample ce = new CustomerExample();
		Criteria c = ce.createCriteria();
		if(!"".equals(customercode)){
			System.out.println("inquire.getCustomercode():"+customercode);
			c.andCustomercodeEqualTo(customercode);
		}
		if(!"".equals(companyname)){
			System.out.println("inquire.getCompanyname():"+companyname);
			c.andCompanynameEqualTo(companyname);
		}
		if(!"".equals(sortexpression)){
			ce.setOrderByClause(sortexpression +" " +sortdirection);
		}
		
        List<Customer> list = customerService.selectByExample(example,new Page(currentpagenumber,pagesize));  
		Map m = new HashMap();
		m.put("ReturnMessage", "查询成功");
		m.put("Customers", list);
		m.put("TotalRows", 2);
		m.put("TotalPages", 2);
		return m;
	}
    
    @RequestMapping(value="",   method=RequestMethod.GET)  
    public Page<Customer> getCustomers() {  
    	CustomerExample example = new CustomerExample();
    	Page<Customer> page = new Page<Customer>(1,10);
        customerService.selectByExample(example,page);  
        return page;
    }  
    
    @RequestMapping(value="CreateCustomer", method=RequestMethod.POST,consumes={MediaType.APPLICATION_JSON_VALUE},produces={MediaType.APPLICATION_JSON_VALUE})
	public Map create(Customer customer) {
		int len = customerService.insert(customer);
		Map m = new HashMap();
		m.put("ReturnMessage", len==1?"ok":"failed");
		return m;
	}
	
	@RequestMapping(value="UpdateCustomer", method=RequestMethod.POST,consumes={MediaType.APPLICATION_JSON_VALUE},produces={MediaType.APPLICATION_JSON_VALUE})
	public Map update(Customer customer) {
		int len = customerService.update(customer);
		Map m = new HashMap();
		m.put("ReturnMessage", len==1?"ok":"failed");
		return m;
	}
    

}
