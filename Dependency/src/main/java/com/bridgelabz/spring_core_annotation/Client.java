package com.bridgelabz.spring_core_annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("college.xml loaded");
		College college = context.getBean("collegeBean", College.class);
		System.out.println("College Object is Created by Sprint :" + college);
		college.test();
		context.close();
	}

}  
