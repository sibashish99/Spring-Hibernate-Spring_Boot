package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Exam {
	private String subject;
	private int mark;

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Exam [subject=" + subject + ", mark=" + mark + "]";
	}
     
	@PostConstruct  
	public void init() {
		System.out.println("Inside init method : hey.");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method : hey");
	}
	
}
