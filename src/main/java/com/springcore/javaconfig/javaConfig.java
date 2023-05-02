package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class javaConfig {
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	@Bean
	public Student getStudent()
	{
		//creting new obejct
		Student student = new Student(getSamosa());
		return student;
	}

}
