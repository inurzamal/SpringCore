package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoCI {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/config4.xml");
		
		A a = (A)context.getBean("a_ref");		
		Person p1 = (Person)context.getBean("person1");
		Person p2 = (Person)context.getBean("person2");
		
		System.out.println(a);
		System.out.println(p1);
		System.out.println(p2);
		
		
				
		((ClassPathXmlApplicationContext) context).close();

	}
}
