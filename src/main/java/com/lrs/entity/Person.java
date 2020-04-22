package com.lrs.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//import lombok.Data;

/**
 * 将配置文件中配置的每一个属性值，映射到这个组件中
 * ConfigurationProperties这个注解告诉springboot这个类里面的所有属性都是配置文件中的属性
 * (prefix = "person") 配置文件中哪个属性进行配置
 * 
 * 只有这个组件是容器中的组件才能使用容器中的ConfigurationProperties功能
 * @author lizhe
 *
 */
//@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
	private String name;
	private Integer age;
	private Boolean boss;
	private Date birth;
	
	private Map<String,Object> maps;
	private List<Object> list;
	private Dog dog;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Boolean getBoss() {
		return boss;
	}


	public void setBoss(Boolean boss) {
		this.boss = boss;
	}


	public Date getBirth() {
		return birth;
	}


	public void setBirth(Date birth) {
		this.birth = birth;
	}


	public Map<String, Object> getMaps() {
		return maps;
	}


	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}


	public List<Object> getList() {
		return list;
	}


	public void setList(List<Object> list) {
		this.list = list;
	}


	public Dog getDog() {
		return dog;
	}


	public void setDog(Dog dog) {
		this.dog = dog;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", boss=" + boss + ", birth=" + birth + ", maps=" + maps
				+ ", list=" + list + ", dog=" + dog + "]";
	}
	
	
}
