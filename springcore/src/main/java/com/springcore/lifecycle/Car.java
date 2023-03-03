package com.springcore.lifecycle;

public class Car {
	private double price;
	private String color;
	private String company;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", color=" + color + ", company=" + company + "]";
	}
	
	public void init() {
		System.out.println("Inside init method.");
	}
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	

}
