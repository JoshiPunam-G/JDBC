package com.bridgelabz.di.objecttypevalue;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Client {
	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("coupling.xml");
	System.out.println("xml file loaded");
    Student student= context.getBean("student" ,Student.class);
    student.cheating();
	}
}
