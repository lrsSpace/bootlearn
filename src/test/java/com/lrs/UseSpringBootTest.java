package com.lrs;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	//记录器
	Logger logger = LoggerFactory.getLogger(getClass());
	@Test
	public void helloService() {
		System.out.println(ioc.containsBean("helloService"));
	}
	@Test
	public void contextLoads() {
		System.out.println(person);
	}
	@Test
	public void loggerTest() {
		//日志的级别
		//由低到高
		//可以调整日志的输出级别，日志只会在这个级别的高级别生效
		logger.trace("这是trace日志。。。");
		logger.debug("这是debug日志。。。");
		//springboot默认使用的是info级别，没有指定级别的就用springboot默认级别：root级别
		logger.info("这是info日志。。。");
		logger.warn("这是warn日志。。。");
		logger.error("这是error日志。。。");
	}
}
