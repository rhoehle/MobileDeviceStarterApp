package com.robertleehoehle.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.robertleehoehle.beans.*;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Cellphone cellphone() {
		Cellphone bean = new Cellphone("OnePlus 7");
		bean.setOwner(owner());
		return bean;
	}
	
	@Bean
	public Owner owner() {
		Owner bean = new Owner("Rob Hoehle", "515-123-4567");
		return bean;
	}


}
