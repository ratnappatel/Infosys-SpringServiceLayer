package com.infy.ui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.infy.bean.TestBean;
import com.infy.config.SpringConfig;
import com.infy.service.TestService;

public class AutoWireUI {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
		Environment env=ctx.getEnvironment();
		TestBean bean=ctx.getBean(TestBean.class);
		bean.squareIt(10);
		TestService service=ctx.getBean(TestService.class);
		service.getSquare();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Preference (1/2)");
		int choice=sc.nextInt();
		if(choice==1)
			System.out.println(env.getProperty("one"));
		else if(choice==2)
			System.out.println(env.getProperty("two"));
		else
			System.out.println("Invalid Choice Try Again Later !!!");
		
	}

}
