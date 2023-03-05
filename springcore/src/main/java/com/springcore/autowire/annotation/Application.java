package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/applicationContext.xml");
		Employee emp1= (Employee) context.getBean("employee");
		System.out.println(emp1.toString());
		
		
	}

}
