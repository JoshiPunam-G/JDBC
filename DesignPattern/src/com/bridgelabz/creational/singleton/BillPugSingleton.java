package com.bridgelabz.creational.singleton;

public class BillPugSingleton {
	
	private BillPugSingleton(){}
	
	public static BillPugSingleton getInstance()
	{
		return testBill.instance4;
	}
	
	private static  class testBill
	{
		private static final BillPugSingleton instance4=new BillPugSingleton();
	}

	
}
