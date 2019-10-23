package com.bridgelabz.behavioural.mediator;

public class UserImpl extends User {

	public UserImpl(ChatInterface mediator, String name) {
		super(mediator, name);
		
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name+": Sending Message="+msg);
		mediator.sendMessage(msg, this);
		
	}

	@Override
	public void receive(String msg) {
		System.out.println(this.name+": Received Message:"+msg);
		
	}
}
