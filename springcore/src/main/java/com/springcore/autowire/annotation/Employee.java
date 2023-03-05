package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	
    private Address address;

	public Address getAddress() {
		return address;
	}
 
	
	public void setAddress(Address address) {
		System.out.println("Inside setter ");
		this.address = address;
	}

	@Autowired
	public Employee(Address address) {
		super();
		System.out.println("Inside contructor");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
    
    
    
}
