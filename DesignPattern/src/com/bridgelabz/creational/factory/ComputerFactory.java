package com.bridgelabz.creational.factory;

public class ComputerFactory  {
	
	public computer getInstance(String str)
	{
		if(str.equals("PC"))
			return new PC();
		else if(str.equals("Server"))
			return new Server();
		return null;
	
	}
	
}
