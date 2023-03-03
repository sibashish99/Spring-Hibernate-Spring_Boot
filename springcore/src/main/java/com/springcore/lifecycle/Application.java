package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/applicationContext.xml");
//		Car var1=   (Car) context.getBean("car1");
//		Food var2 = (Food) context.getBean("food1");
//		
//		System.out.println(var1.toString());
//		System.out.println(var2.toString());
		
	    Exam var3=	(Exam) context.getBean("exam1");
	    System.out.println(var3.toString());
		context.registerShutdownHook();
		
		context.close();
	}

}
