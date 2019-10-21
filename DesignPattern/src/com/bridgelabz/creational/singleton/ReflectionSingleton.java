package com.bridgelabz.creational.singleton;

import java.lang.reflect.Constructor;

class test
{
	public static test instance5=new test();
	
	private test() {}
}
public class ReflectionSingleton {

	public static void main(String[] args) {
		
		test obj=test.instance5;
		test obj1=null;
		//use reflection
	try
	{
		Constructor[] constructors=test.class.getDeclaredConstructors();
		for(Constructor constructor:constructors)
		{
			constructor.setAccessible(true);
		    obj1=(test)constructor.newInstance();
		    break;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		System.out.println("object 1:"+obj.hashCode());
		System.out.println("object 2:"+obj1.hashCode());
		
	}

}
