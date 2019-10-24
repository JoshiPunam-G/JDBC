package com.bridgelabz.spring_core_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class College {
	
	@Value("Pratibha")
	private String studentName;
	
	@Autowired
	private  Principal principal;
	@Autowired
	private Teacher teacher;
	
	@Autowired
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Autowired
	public void test() {
		principal.principalInfo();
		System.out.println("testing this call method");
		System.out.println("Student Name: "+ studentName);
		
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

}
