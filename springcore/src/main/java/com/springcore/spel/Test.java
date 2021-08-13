package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		
		Var v = context.getBean("var", Var.class);
		
		System.out.println(v);
		
		
		
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
