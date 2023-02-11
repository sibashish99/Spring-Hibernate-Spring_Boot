package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/ref/applicationContext.xml");
		FirstObject var1=  (FirstObject) context.getBean("firRef");
		System.out.println("Value of First var x: "+var1.getX());
		System.out.println("Value of second var y: "+var1.getOb().getY());
		System.out.println(var1);
	}

}
