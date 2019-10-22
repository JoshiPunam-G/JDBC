package com.bridgelabz.spring_value_required;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
    
	@Value("${student.name}")
	private String name;
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	@Value("${student.hobby}")
	private String hobby;
	public String getName() {
		return name;
	}
	
	
	
	public void displayInfo()
	{
		System.out.println("Name of Student  :" +name);
		System.out.println("Interested Course Name  :" +interestedCourse);
		System.out.println("Hobby of Student  :"+hobby);
	}
}
