package com.lrs.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lrs.entity.Person;

/**
 *  controller 注解标明此类为controller层
 */
@Controller
public class DemoController {
	@Resource
	Person person;
    @ResponseBody//此注解标明 此方法返回的是数据
    @RequestMapping("/hello")//此注解标明请求地址
    public Object hello(){
        return person;
    }
    @RequestMapping("/success")
    public Object success(){
        //classpath://templates/success.html
        return "success";
    }
}
