package com.springcore.constructerinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/constructerinjection/ContructerConfig.xml");
	Person p = (Person) context.getBean("person");
	System.out.println(p);
	}

}
