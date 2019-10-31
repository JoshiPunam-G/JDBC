package com.bridgelabz.aop.annotation;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientTest {

	public static void main(String[] args) { 
		ApplicationContext ctx= new ClassPathXmlApplicationContext("model.xml");
		AccountService accountService = ctx.getBean("accountService", AccountServiceImpl.class);
		
		accountService.updateAccountBalance(new Account("6778888886", "Money tranfer"), 3000L);
		((AbstractApplicationContext) ctx).close();
	}

}
