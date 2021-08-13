package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Var {
	
	@Value("#{5+6}")
	private int x;
	
	@Value("#{T(java.lang.Math).PI}") //call static variable
	private float y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}") //call static method
	private double z;
	
	@Value("#{(new java.lang.String('Kiyaan Islam'))}") //creating objects in the spEL
	private String sname;
	
	@Value("#{10>5}")
	private boolean isActive;
	

	@Override
	public String toString() {
		return "Var [x=" + x + ", y=" + y + ", z=" + z + ", sname=" + sname + ", isActive=" + isActive + "]";
	}

}
