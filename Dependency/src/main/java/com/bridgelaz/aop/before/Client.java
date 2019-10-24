package com.bridgelaz.aop.before;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("operation.xml");
	Operation operation=context.getBean("opBean",Operation.class);
	operation.msg();
	operation.k();
	operation.m();

	}

}
