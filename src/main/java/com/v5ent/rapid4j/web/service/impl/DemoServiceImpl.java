package com.v5ent.rapid4j.web.service.impl;

import com.v5ent.rapid4j.web.service.DemoService;

public class DemoServiceImpl implements DemoService {
	 
    public String sayHello(String name) {
        return "Hello " + name;
    }
 
}
