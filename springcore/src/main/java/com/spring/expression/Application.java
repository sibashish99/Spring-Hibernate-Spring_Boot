package com.spring.expression;

import java.beans.Expression;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/expression/applicationContext.xml");
        Add a1= (Add) context.getBean("add",Add.class);
        System.out.println(a1);
        
        SpelExpressionParser sp= new SpelExpressionParser();
        Expression es= (Expression) sp.parseExpression("12+87");
        try {
			System.out.println(es.getValue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
