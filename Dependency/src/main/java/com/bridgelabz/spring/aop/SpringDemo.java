package com.bridgelabz.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
	
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Abc a=context.getBean(Abc.class);
		a.show();
	}

}
