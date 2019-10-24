package com.bridgelabz.spring_core_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class CollegeConfig {
	@Bean
	public Teacher mathTeacher()
	{
		return new MathTeacher();
	}

	@Bean
	public Principal prinicipalBean()
	{
		return new  Principal();
	}
	
	@Bean
	public College collegeBean() {
	College college=new College();
	college.setPrincipal(prinicipalBean());
		return college;
	}

}
