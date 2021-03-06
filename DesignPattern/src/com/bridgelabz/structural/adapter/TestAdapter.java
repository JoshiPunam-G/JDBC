package com.bridgelabz.structural.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		testClassAdapter();
		testObjectAdapter();

	}	
	private static void testClassAdapter() {
		SocketAdapter sa=new SocketClassAdapter();
		Volt v120=getVolt(sa,120);
		Volt v12=getVolt(sa,12);
		Volt v3=getVolt(sa,3);
	
 		System.out.println("V120 using Adapter class :"+v120.getVolt());
        System.out.println("V12 using Adapter class :"+v12.getVolt());
        System.out.println("V3 using Adpater class :"+v3.getVolt());
	}
	private static void testObjectAdapter() {
		SocketAdapter sa=new SocketObjectAdapter();
		Volt v120=getVolt(sa,120);
		Volt v12=getVolt(sa,12);
		Volt v3=getVolt(sa,3);
	
 		System.out.println("V120 using Adapter class :"+v120.getVolt());
        System.out.println("V12 using Adapter class :"+v12.getVolt());
        System.out.println("V3 using Adpater class :"+v3.getVolt());
		
	}

	private static Volt getVolt(SocketAdapter sa, int i) {
		switch(i)
		{
		case 120:
			return sa.get120Volt();
		case 12:
			return sa.get12Volt();
		case 3:
			return sa.get3Volt();
	    default :return sa.get120Volt();		
		}
	
	}
	

}
