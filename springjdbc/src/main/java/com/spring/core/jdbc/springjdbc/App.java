package com.spring.core.jdbc.springjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.core.jdbc.springjdbc.dao.StudentDao;
import com.spring.core.jdbc.springjdbc.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "***************Welcome to student management***********" );
        int choice=0;
        Scanner sc = new Scanner(System.in);
    	
        while(true) {
         System.out.println("Enter your Choose \n 1 => Add Student \n 2 => Update of Student using id \n 3 => Delete Student by id \n 4=> Get all student details \n 5=> Get student by id\n 9 => Exit \n Enter:");
         choice= sc.nextInt() ;
    	
    	 ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/jdbc/springjdbc/applicationContext.xml");
    	 StudentDao template= context.getBean("studentDao",StudentDao.class);
    	
    	 switch(choice){
    	 case 1:
    	   Student st= new Student();
    	   st.setId(1005);
    	   st.setName("Tammye orr");
    	   st.setCity("LA");
    	   System.out.println("Nos of raws inserted "+template.insertStudent(st));
    	   break;
    	 case 2:
    		 Student st1= new Student();
      	     st1.setId(1002);
      	     st1.setName("channa");
      	     st1.setCity("Noida");
      	     System.out.println("Nos of raws updated "+ template.updateStudent(st1));
      	     break;
    	 case 3:
    		 Student st3= new Student();
      	     st3.setId(1004);
      	     System.out.println("Nos of raws deleted "+ template.deleteStudent(st3));
      	     break;
    	 case 4: 
    		 List<Student> students = template.getAllStudent();
    		 System.out.println("All student details..");
             for (Student student : students) {
                 System.out.println(student.getId() + " " + student.getName() + " " + student.getCity());
             }
             break;
    	 case 5:
    		 System.out.println("Student details by id ..");
    		 Student st4= new Student();
    		 st4.setId(1003);
    		 System.out.println("Student details of id "+st4.getId()+ " is "+ template.getStudentByid(st4));
    	     break;
    	 case 9:
    		 System.out.println("Status exit..");
		     System.exit(0);
    	 }
        }
    }
}
