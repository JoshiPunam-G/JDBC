package com.bridgelabz.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.scheduling.annotation.Async;

@Aspect
public class Helper {
	public void log()
	{
		System.out.println("show called");
	}

}

