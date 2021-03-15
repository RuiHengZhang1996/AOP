package com.ruiheng.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruiheng.spring5.service.UserService;

public class testTest {

	@Test
	public void testService() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		
		UserService userService = context.getBean("userService",UserService.class);
		userService.add();
	}
	
}
