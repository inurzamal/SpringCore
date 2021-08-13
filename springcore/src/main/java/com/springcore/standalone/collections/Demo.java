package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/config_s.xml");
		Employee emp1 = (Employee)context.getBean("emp1");
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getProp());
		
		
		
		((ClassPathXmlApplicationContext) context).close();

	}
	
}
