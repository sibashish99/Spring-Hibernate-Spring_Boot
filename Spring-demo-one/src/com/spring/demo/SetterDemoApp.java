package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load Spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//Retrieve bean from spring container
		Coach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		
		System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());	
		//close the context
		context.close();

	}

}
