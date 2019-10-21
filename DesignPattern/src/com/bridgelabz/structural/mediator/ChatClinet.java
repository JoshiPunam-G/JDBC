package com.bridgelabz.structural.mediator;

public class ChatClinet {

	public static void main(String[] args) {
		 ChatInterface mediator=new ChatMediatorImpl();
		 User user1 = new UserImpl(mediator, "nikita");
		 User user2=new UserImpl(mediator,"pratibha");
		 mediator.addUser(user1);
		 mediator.addUser(user2);
		 
        user1.send("hello ...");
	}

}
