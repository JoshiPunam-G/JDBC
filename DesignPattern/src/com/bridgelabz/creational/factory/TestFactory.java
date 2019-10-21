package com.bridgelabz.creational.factory;

public class TestFactory {

	public static void main(String[] args) {
		
		ComputerFactory com=new ComputerFactory();
		computer comp=com.getInstance("PC");
		comp.show();
		
		computer ser=com.getInstance("Server");
		ser.show();
		
	}
}
