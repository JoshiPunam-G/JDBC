package com.bridgelabz.dependencyingection;

public class Student {
	
    private String studName;
    private int rollNo;
   
	public Student(int rollNo) {
		this.rollNo = rollNo;
	}

	public Student(String studName, int rollNo) {
		this.studName = studName;
		this.rollNo = rollNo;
	}

	/*
	 * public void setRollNo(int rollNo) { this.rollNo = rollNo;
	 * System.out.println("Setter method Call :"+ " :setRollNo ");
	 * 
	 * }
	 * 
	 * public void setStudName(String studName) { this.studName = studName;
	 * System.out.println("Setter method Call :" + ":setStudName "); }
	 */



	public void display()
     {
    	 System.out.println("Student Name is :" + studName 
    			         +  " and Roll Number is :" + rollNo);
     }
     
     
}
