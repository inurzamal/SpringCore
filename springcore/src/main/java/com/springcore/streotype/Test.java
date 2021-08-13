package com.springcore.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/streotype/streo_config.xml");
		
		Student student = context.getBean("student", Student.class);
		Student student1 = context.getBean("student", Student.class);
		
		System.out.println(student.hashCode());
		
		System.out.println(student1.hashCode());
		
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
