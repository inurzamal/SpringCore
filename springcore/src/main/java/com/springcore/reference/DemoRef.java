package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoRef {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/config3.xml");
		
		A a = (A)context.getBean("a_ref");
			
		System.out.println(a.getX() + ":" + a.getObj().getY());
		
		System.out.println(a);
		
		
				
		((ClassPathXmlApplicationContext) context).close();

	}
}
