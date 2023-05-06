package com.spring.core.jdbc.springjdbc.dao;

import java.util.List;

import com.spring.core.jdbc.springjdbc.entity.Student;

public interface StudentDao {
	public int insertStudent(Student student);
	public int updateStudent(Student student);
	public int deleteStudent(Student student);
	public List<Student> getAllStudent();
}
