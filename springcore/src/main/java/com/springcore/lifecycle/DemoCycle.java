package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoCycle {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config5.xml");
		
		LifeCycleTest t1 = (LifeCycleTest)context.getBean("cycle1");
		System.out.println(t1);
		
		LifeCycleInterface t2 =(LifeCycleInterface)context.getBean("cycle2");
		System.out.println(t2);
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
