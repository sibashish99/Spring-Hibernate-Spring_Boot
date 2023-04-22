package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stereotype/applicationContext.xml");
		Student s1= (Student) context.getBean("student",Student.class);
		
        System.out.println(s1);
	}

}
