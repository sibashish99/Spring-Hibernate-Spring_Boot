package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        Coach theCoach1 = context.getBean("myCoach",Coach.class);
        
        System.out.println(theCoach1.getDailyWorkout());
        
        context.close();
	}

}
