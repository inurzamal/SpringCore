package com.springcore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Address myAddress() {		
		return new Address();
	}
	
	@Bean(name={"student", "temp", "s3"})
	public Student myStudent() {		
		Student student = new Student(1, "Rahul", myAddress());
		return student;
	}

}
