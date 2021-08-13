package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleInterface implements InitializingBean, DisposableBean {
	
	private String name;
	

	public LifeCycleInterface() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LifeCycleInterface(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "LifeCycleInterface [name=" + name + "]";
	}


	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method using Interface");
		
	}
	
	public void destroy() throws Exception {
		System.out.println("Destroy method using Interface");
		
	}
	
	

}
