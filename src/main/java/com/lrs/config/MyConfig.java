package com.lrs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lrs.service.HelloService;

/**
 * @Configuration指明当前类是配置类；就是来替代之前的配置文件
 * 之前是在配置文件中加<bean></bean>标签中添加组件
 * @author lizhe
 *
 */
@Configuration
public class MyConfig {
	
	/**将方法的返回值添加到容器中；容器中这个组件的默认id就是这个方法名*/
	@Bean
	public HelloService helloService() {
		return new HelloService();
	}
}
