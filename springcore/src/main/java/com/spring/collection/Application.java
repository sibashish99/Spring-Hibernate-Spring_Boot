package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.Student;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collection/applicationContext.xml");
         Employee employee1= (Employee) context.getBean("employee1");
//         System.out.println(employee1.getEmployeeName());
//         System.out.println(employee1.getAddress());
//         System.out.println(employee1.getCourses());
//         System.out.println(employee1.getPhones());
           System.out.println(employee1);
         
	}

}
