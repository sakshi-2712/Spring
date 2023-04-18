package com.springcore.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ApplicationContext context=new  ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autoConfig.xml");
A address1 = 	context.getBean("address1",A.class);
System.out.println(address1);
	}

}
