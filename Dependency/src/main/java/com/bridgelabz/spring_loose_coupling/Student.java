package com.bridgelabz.spring_loose_coupling;

public class Student {

	private int id;
	private MathCheat mathcheat;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setMathcheat(MathCheat mathcheat) {
		this.mathcheat = mathcheat;
	}

	public void cheating()
	{ 
		mathcheat.mathcheat();
	}
}
