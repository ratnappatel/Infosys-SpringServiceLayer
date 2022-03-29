package com.infy.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.bean.HelloBean;
import com.infy.config.SpringConfig;

public class AnnoUserInterface {

	public static void main(String args[])
	{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
		HelloBean hello=ctx.getBean(HelloBean.class);
		String message=hello.sayHello("Uttam");
		System.out.println(message);
		
	}
}
