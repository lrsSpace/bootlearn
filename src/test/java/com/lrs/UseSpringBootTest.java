package com.lrs;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.lrs.entity.Person;


/**
 * springboot 单元测试
 * 
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 * @author lizhe
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UseSpringBootTest {
	@Resource
	Person person;
	@Autowired
	ApplicationContext ioc;
	
	@Test
	public void helloService() {
		System.out.println(ioc.containsBean("helloService"));
	}
	@Test
	public void contextLoads() {
		System.out.println(person);
	}
}
