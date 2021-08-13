package com.springcore.lifecycle;

public class LifeCycleTest {
	
	private int x;

	public LifeCycleTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LifeCycleTest(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("Setting property...");
		this.x = x;
	}

	@Override
	public String toString() {
		return "LifeCycleTest [x=" + x + "]";
	}
	
	public void hi() {System.out.println("Inside init..");}
	
	public void bye() {System.out.println("Inside destroy..");}
	
}
