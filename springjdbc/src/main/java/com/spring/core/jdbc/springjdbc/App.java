package com.spring.core.jdbc.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.core.jdbc.springjdbc.dao.StudentDao;
import com.spring.core.jdbc.springjdbc.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/jdbc/springjdbc/applicationContext.xml");
    	StudentDao template= context.getBean("studentDao",StudentDao.class);
    	
    	
    	Student st= new Student();
    	st.setId(1003);
    	st.setName("Gopal");
    	st.setCity("bangalore");
    	int res= template.insertStudent(st);
    	System.out.println("Nos of raws inserted "+res);
    	
    }
}
