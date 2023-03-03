package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.ref.FirstObject;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/applicationContext.xml");
		Car var1=   (Car) context.getBean("car1");
		
		System.out.println(var1.toString());
		context.registerShutdownHook();
	}

}
