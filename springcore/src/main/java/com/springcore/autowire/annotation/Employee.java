package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private String name;
	
	@Autowired	
	@Qualifier("addr1")
	private Address addr;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Employee(Address addr) {
		super();
		System.out.println("Setting Address using cinstructior1");
		this.addr = addr;
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
		System.out.println("Setting Address using setter-method");
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", addr=" + addr + "]";
	}
	
}
