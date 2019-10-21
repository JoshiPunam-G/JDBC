package com.bridgelabz.creational.singleton;

public class EagerInitializedSingleton {
	private static EagerInitializedSingleton instance;
	
	private EagerInitializedSingleton() {}
	
	public static EagerInitializedSingleton getInstance()
	{
		if(instance==null)
		{
			//System.out.println("inside instance method");
			instance=new EagerInitializedSingleton();
		}
		return instance;
	}
}
