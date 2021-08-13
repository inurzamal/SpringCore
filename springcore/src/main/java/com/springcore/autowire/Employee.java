package com.springcore.autowire;

public class Employee {
	
	private String name;
	private Address addr;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, Address addr) {
		super();
		this.name = name;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", addr=" + addr + "]";
	}
	
}
