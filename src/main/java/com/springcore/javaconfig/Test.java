package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated me thod stub
   ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
   Student student = context.getBean("getStudent",Student.class);
   System.out.println(student);
   student.study();
  
	}

}