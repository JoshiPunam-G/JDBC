package com.bridgelabz.creational.singleton;

public class StaticBlockSingleton {
	public static StaticBlockSingleton instance1;
	
	private StaticBlockSingleton() {
		
	}
	static {
		try
		{
			instance1=new StaticBlockSingleton();
		}
		catch(Exception e)
		{
			System.out.println("Exception caught:"+e);
		}
	}
	public static StaticBlockSingleton getInstance()
	{
		return instance1;
	}

}
