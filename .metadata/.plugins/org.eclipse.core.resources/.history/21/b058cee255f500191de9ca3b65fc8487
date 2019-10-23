package com.bridgelabz.structural.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatInterface  {

	
	private List<User> users;

	public ChatMediatorImpl()
	{
		this.users=new ArrayList<>();
	}


	public  void sendMessage(String msg, User user) {
		for(User u:users)
		{
			if(u!=users)
			{
				u.receive(msg);
			}
		}
	}

	public void addUser(User user) {
		this.users.add(user);
		
	}


}
