package com.springcore.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student s1 = context.getBean("student", Student.class);
		
		System.out.println(s1);
		s1.study();
		
		
		
		((AbstractApplicationContext) context).close();

	}

}
