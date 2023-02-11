package com.spring.ci;

public class Person {
   private String personName;
   private int personId;
   private double personPhone;
   private Certificate cer;
   
   public Person(String personName, int personId, double personPhone,Certificate cer) {
	this.personName = personName;
	this.personId = personId;
	this.personPhone = personPhone;
	this.cer=cer;
  }

  @Override
  public String toString() {
	return this.personName+" "+this.personId+" "+this.personPhone+ " { "+ this.cer.name +" }";
 }
   
   
   
   
   
}
