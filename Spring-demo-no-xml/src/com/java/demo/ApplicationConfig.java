package com.java.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Sprotconfig.class);
		
		Coach theCoach1 = context.getBean("tennisCoach",Coach.class);
		Coach theCoach2 = context.getBean("tennisCoach",Coach.class);
		
		System.out.println("pointing to same object : "+ (theCoach1==theCoach2));
		System.out.println("memory location the theCoach1 is => "+theCoach1 +"\n memory location of theCoach2 =>" + theCoach2);
        
		context.close();
	}

}
