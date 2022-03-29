package com.infy.bean;

import org.springframework.stereotype.Component;

// if Component-scan enabled then this class will be instantiated implicitly by IOC container 
@Component
public class HelloBean {
	
	public String sayHello(String name)
	{
		return "Hello Mr./Mrs "+name;
	}

}
