package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/lifecycle/LifecycleConfig.xml");
       // Lifecycle s1=(Lifecycle) context.getBean("s1");
        //System.out.println(s1);
        context.registerShutdownHook();
        //System.out.println("+++++++++++++++++");
        //Lifecycle2 s2 = (Lifecycle2) context.getBean("s2");
        //System.out.println(s2);
        context.getBean("s3");
        Example s3=(Example) context.getBean("s3");
        System.out.println(s3);
        
        
	}

}
