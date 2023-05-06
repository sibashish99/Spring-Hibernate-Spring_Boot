package com.spring.core.jdbc.springjdbc.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.core.jdbc.springjdbc.entity.Student;

public class StudentDaoImp implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public int insertStudent(Student student) {
		// TODO Auto-generated method stub
		String query= "insert into student values(?,?,?)";
		return this.jdbcTemplate.update(query,student.getId(),student.getName(), student.getCity());
		
	}


	public int updateStudent(Student student) {
		// TODO Auto-generated method stub
		String query= "update student set name=? , city=? where id=?";
		return this.jdbcTemplate.update(query,student.getName(),student.getCity(), student.getId());
	}


	public int deleteStudent(Student student) {
		// TODO Auto-generated method stub
		String query= "delete  from student where id=?";
		return this.jdbcTemplate.update(query,student.getId());
	}


	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		String query = "select * from student";
	    List<Student> students = new ArrayList<Student>();
	    
	    List<Map<String, Object>> studentRows = jdbcTemplate.queryForList(query);
	    
	    for (Map<String, Object> studentRow : studentRows) {
	        Student student = new Student();
	        student.setId((Integer) studentRow.get("id"));
	        student.setName((String) studentRow.get("name"));
	        student.setCity((String) studentRow.get("city"));
	        students.add(student);
	    }
	    
	    return students;
		
	}

	
     
}
