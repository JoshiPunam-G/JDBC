package com.bridgelabz.behavioural.mediator;

public abstract class User {
	protected ChatInterface mediator;
	protected String name;
	
	public User(ChatInterface mediator, String name) {
		super();
		this.mediator = mediator;
		this.name = name;
	}
	public abstract void send(String msg);
	public abstract void receive(String msg);
	
	

}
