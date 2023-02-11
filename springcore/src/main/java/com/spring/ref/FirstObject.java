package com.spring.ref;

public class FirstObject {
    private int x;
    private SecondObject ob;
    
    
    
	public FirstObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public SecondObject getOb() {
		return ob;
	}
	public void setOb(SecondObject ob) {
		this.ob = ob;
	}

	@Override
	public String toString() {
		return "FirstObject [x=" + x + ", ob=" + ob + "]";
	}
    
	
    
}
