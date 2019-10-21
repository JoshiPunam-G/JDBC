package com.bridgelabz.creational.singleton;

public class LazySingleton {
	
	private static LazySingleton instance2=null;
	
	private LazySingleton() {}
	
	public static LazySingleton getInstance()
	{
		if(instance2==null)
		{
			synchronized(LazySingleton.class)
			{
					instance2=new LazySingleton();
				
			}
		}
		return instance2;
	}

}
