package com.spring.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/standalone/applicationContext.xml");
        Person p1= (Person) context.getBean("person1");
        System.out.println(p1);
        
        
	}

}
