package com.spring.core.hibernate;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started.." );
        SessionFactory factory= new Configuration().configure().buildSessionFactory();
        System.out.println(factory);
        
        Student student =new Student();
        student.setId(1002);
        student.setName("Ashish");
        student.setCity("Agartala");
        student.setBranch("ME");
        
        System.out.println(student);
        
        Session session= factory.openSession();
        Transaction tx =session.beginTransaction();
        session.save(student);
        tx.commit();
        
        
        session.close();
    }
}
