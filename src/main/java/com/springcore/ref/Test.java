package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
         ref temp =(ref) context.getBean("refref");
         System.out.println(temp.getX());
         System.out.println(temp.getOb().getY());
         System.out.println(temp);
	}

}
