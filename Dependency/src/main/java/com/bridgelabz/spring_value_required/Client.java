package com.bridgelabz.spring_value_required;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Client {

	public static void main(String[] args) {


	ApplicationContext context=new ClassPathXmlApplicationContext("value.xml");
	Student student=context.getBean("student" ,Student.class);
	student.displayInfo();
    
	}

}
 