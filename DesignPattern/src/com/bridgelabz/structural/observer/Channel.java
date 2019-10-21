package com.bridgelabz.structural.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	private List<Subscriber> subscriber=new ArrayList<>();
	private String title;
	
	public void subscibe(Subscriber sub)
	{
		subscriber.add(sub);
	}
	public void unscribe(Subscriber sub)
	{
		subscriber.add(sub);
	}
	public void notifychannel()
	{
		for(Subscriber sub: subscriber)
		{
			sub.update();
		}
	}
   
	public void upload(String title)
	{
		this.title=title;
		notifychannel();
		
		
	}
}
