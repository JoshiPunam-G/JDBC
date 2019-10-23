package com.bridgelabz.spring_core_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "com.bridgelabz.spring_core_annotation")
public class CollegeConfig {

	@Bean
	public College collegeBean() {
		College college = new College();
		return college;
	}

}
