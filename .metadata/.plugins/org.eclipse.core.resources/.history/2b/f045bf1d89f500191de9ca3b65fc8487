package com.bridgelabz.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("heartHeart")
	private Heart heart;
	
	public void startPumping()
	{
		if(heart!=null)
		{
		heart.pump();
		System.out.println("Name Of animal is:" + heart.getNameOfAnimal()+ "\n" +
				 "Number  of Hearts present :" +heart.getNoOfHeart());
		}
		else
		{
			System.out.println("You are Dead ");
		}
	}
	
	
}
