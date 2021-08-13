package com.springcore.constructorInjection;

import java.util.List;

public class Person {
	
	private String name;
	private int id;
	private String city;
	private List<String> list;
	
	public Person() {
		super();
	}

	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
		
	public Person(String name, int id, String city) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
	}
	
	public Person(String name, int id, String city, List<String> list) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", city=" + city + ", list=" + list + "]";
	}

	
}
