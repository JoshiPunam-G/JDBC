package com.bridgelabz.spring_loose_coupling;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Client {

	public static void main(String[] args) {


	ApplicationContext context=new ClassPathXmlApplicationContext("object.xml");
	System.out.println("Object type loaded");
    Student student= context.getBean("student" ,Student.class);
    student.cheating();
    
    AnotherStudent another=context.getBean("anotherstudent" ,AnotherStudent.class);
    another.startcheating();
	}

}
