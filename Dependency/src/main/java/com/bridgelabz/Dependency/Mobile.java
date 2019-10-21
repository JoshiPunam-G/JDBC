package com.bridgelabz.Dependency;

import java.awt.image.renderable.ContextualRenderedImageFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("Class Loaded");
	
	Sim sim= context.getBean("sim" ,Sim.class);
	sim.calling();
	sim.data();
	}

}
