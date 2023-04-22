package com.spring.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Sibashish Biswas")
	private String studentName;
	@Value("329951")
	private int studentId;
	@Value("Bengluru")
	private String studentCity;
	@Value("#{temp}")
    private List<String> address;
    
	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentCity=" + studentCity
				+ ", address=" + address + "]";
	}

}
