package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/config_auto.xml");
		
		Employee e1 = context.getBean("emp1", Employee.class);
		System.out.println(e1);
		
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
