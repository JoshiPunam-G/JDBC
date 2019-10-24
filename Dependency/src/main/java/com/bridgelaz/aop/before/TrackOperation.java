package com.bridgelaz.aop.before;

import org.aspectj.lang.JoinPoint;

public class TrackOperation {

	public void myadvice(JoinPoint jp)
	{
		System.out.println("Method Signature:"+jp.getSignature());
	}
}
