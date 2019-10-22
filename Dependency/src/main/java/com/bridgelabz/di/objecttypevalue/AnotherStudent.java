package com.bridgelabz.di.objecttypevalue;

public class AnotherStudent {
	
	private MathCheat cheat;
	
	public void setcheat(MathCheat cheat) {
		this.cheat = cheat;
	}
	public void startcheating()
	{ 
		cheat.cheat();
	} 

}
