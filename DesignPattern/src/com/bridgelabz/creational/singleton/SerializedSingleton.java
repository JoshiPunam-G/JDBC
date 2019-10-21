package com.bridgelabz.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{

	private static final long serialVersionUID = 12345;
	
	private SerializedSingleton () {}
	
	private static class SerializedHelper
	{
		 static SerializedSingleton instance=new SerializedSingleton();
	}
	
	public static SerializedSingleton getInstance()
	{
		return SerializedHelper.instance;
	}
	
}
