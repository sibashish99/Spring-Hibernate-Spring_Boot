package com.spring.core.jdbc.springjdbc.dao;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.core.jdbc.springjdbc.entity.Student;

@Component("studentDao")
public class StudentDaoImp implements StudentDao{

	
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
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

    /**
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
    */
	
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		String query = "select * from student";
		List<Student> stl= this.jdbcTemplate.query(query, new RowMapperIml());
		return stl;
	}

	public Student getStudentByid(Student student) {
		// TODO Auto-generated method stub
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperIml();
		Student st5= this.jdbcTemplate.queryForObject(query, rowMapper, student.getId());
		return st5;
	}


	

	
     
}
