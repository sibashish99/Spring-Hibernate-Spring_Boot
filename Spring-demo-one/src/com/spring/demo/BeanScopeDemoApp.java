package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach theCoach1 = context.getBean("myCoach",Coach.class);
        Coach theCoach2 = context.getBean("myCoach",Coach.class);
        
        System.out.println("Compare the two objects =>"+(theCoach1==theCoach2));
        System.out.println("memory location of 1 =>"+theCoach1+" and 2 =>"+theCoach2);
        
        context.close();
	}

}
