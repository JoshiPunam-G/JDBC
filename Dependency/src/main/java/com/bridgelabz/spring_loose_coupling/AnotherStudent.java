package com.bridgelabz.spring_loose_coupling;

public class AnotherStudent {
	
	private MathCheat cheat;
	
	public void setcheat(MathCheat cheat) {
		this.cheat = cheat;
	}
	public void startcheating()
	{ 
		cheat.mathcheat();
	} 

}
