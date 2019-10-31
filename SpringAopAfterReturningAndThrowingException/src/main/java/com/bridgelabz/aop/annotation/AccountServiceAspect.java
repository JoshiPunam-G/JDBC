package com.bridgelabz.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Aspect
//@Component 
public class AccountServiceAspect {

	@Before(value="com.bridgelaz.aop.before.AccountServiceImpl.*(..)")
	public void beforeAdvice(JoinPoint joinPoint){
		System.out.println("Before method:"+joinPoint.getSignature().getName()+",Class:"+joinPoint.getTarget().getClass().getSimpleName());
	}
	
   @After(value="com.bridgelaz.aop.before.AccountServiceImpl.*(..)")
	public void afterAdvice(JoinPoint joinPoint){
		System.out.println("After method:"+joinPoint.getSignature().getName()+",Class:"+joinPoint.getTarget().getClass().getSimpleName());
	}
}
 