package com.v5ent.rapid4j.core.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.v5ent.rapid4j.web.service.DemoService;

public class Consumer {
 
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext-dubbo-cusumer.xml"});
        context.start();
 
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
 
        System.out.println( hello ); // 显示调用结果
    }
 
}