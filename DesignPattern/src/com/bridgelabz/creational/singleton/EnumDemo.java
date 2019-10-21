package com.bridgelabz.creational.singleton;

public class EnumDemo {

	public static void main(String[] args) {
		EnumS singleton=EnumS.INSTANCE;
		System.out.println(singleton.getValue());
		singleton.setValue(10);
		System.out.println(singleton.getValue());

	}

}
