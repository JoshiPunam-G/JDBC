package com.bridgelabz.structural.adapter;

public class SocketClassAdapter extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
         Volt v=getVolt();
		return convertVolt(v,10);
	}

	@Override
	public Volt get3Volt() {
		 Volt v=getVolt();
		return convertVolt(v,20);
	}
	
	private Volt convertVolt(Volt v,int i)
	{
		return new Volt(v.getVolt()/i);
	}

}
