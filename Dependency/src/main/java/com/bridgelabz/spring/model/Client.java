package com.bridgelabz.spring.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("model.xml");
		AccountServiceImpl bean=context.getBean("accountService",AccountServiceImpl.class);
      	bean.updateAccountBalance(new Account("123456","Money Transfer"), 2000);
	
	((AbstractApplicationContext) context).close();
	}

}
