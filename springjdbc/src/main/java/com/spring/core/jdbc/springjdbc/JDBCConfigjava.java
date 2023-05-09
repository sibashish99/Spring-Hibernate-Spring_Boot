package com.spring.core.jdbc.springjdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



@Configuration
@ComponentScan(basePackages = {"com.spring.core.jdbc.springjdbc.dao"})
public class JDBCConfigjava {
	
   @Bean("ds")
   public DataSource getDataSource() {
	   DriverManagerDataSource ds = new DriverManagerDataSource();
	   ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	   ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
	   ds.setUsername("root");
	   ds.setPassword("root");
			
	   return ds;
   }
   
   @Bean("jdbcTemplate")
   public JdbcTemplate getTemplate() {
	   JdbcTemplate template= new JdbcTemplate();
	   template.setDataSource(getDataSource());
	   return template;
   }
   
   /**@Bean("studentDao")
   public StudentDao getStudentDao() {
	   StudentDaoImp st= new StudentDaoImp();
	   st.setJdbcTemplate(getTemplate());
	   return st;
	   
   }
   */
   
}
