package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //load Spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrive bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach theCoach1=context.getBean("myCoach1",Coach.class);
		
		//call method on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
//		System.out.println(theCoach1.getDailyWorkout());
//		System.out.println(theCoach1.getDailyFortune());
		
		
		//close the context
		context.close();
		
	}

}
