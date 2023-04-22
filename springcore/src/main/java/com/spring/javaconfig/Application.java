package com.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
   public static void main(String[] args) {
	   ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
	   
	   Student s1= (Student) context.getBean("getStudent",Student.class);
	   System.out.println(s1);
	   s1.study();
  }
}
