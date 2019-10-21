package com.bridgelabz.creational.singleton;

public enum EnumS {
	INSTANCE;
	int value;
	public int getValue()
	{
		return value;
	}
	public void setValue(int value)
	{
		this.value=value;
	}
}
