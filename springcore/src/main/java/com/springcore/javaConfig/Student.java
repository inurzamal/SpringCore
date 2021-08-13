package com.springcore.javaConfig;

public class Student {
	
	private int roll;
	
	private String name;
	
	private Address address;
	
	public void study() 
	{
		address.display();
		System.out.println("Student studying..");
	}
	
	public Student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	

}
