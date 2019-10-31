package com.bridgelaz.aop.before;

import java.net.URLClassLoader;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientTest {

	public static void main(String[] args) {
		
		/*
		 * URLClassLoader classLoader =
		 * (URLClassLoader)ClientTest.class.getClassLoader();
		 * System.out.println(Arrays.toString(classLoader.getURLs()));
		 */

		ApplicationContext ctx= new ClassPathXmlApplicationContext("model.xml");
		AccountServiceImpl accountService = ctx.getBean("accountService", AccountServiceImpl.class);
		
		accountService.updateAccountBalance(new Account("6778888886", "Money tranfer"), 3000L);
		((AbstractApplicationContext) ctx).close();
	}

}
