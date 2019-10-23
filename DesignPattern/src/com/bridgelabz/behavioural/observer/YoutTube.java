package com.bridgelabz.behavioural.observer;

public class YoutTube {

	public static void main(String[] args) {
		
		Channel telusko=new Channel();
		
		Subscriber s1=new Subscriber ("pratibha");
		Subscriber s2=new Subscriber ("nikita");
		
		telusko.subscibe(s1);
		telusko.subscibe(s2);
		
        telusko.upload("java programming video");
	}

}
