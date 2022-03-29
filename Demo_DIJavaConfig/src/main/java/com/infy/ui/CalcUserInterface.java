package com.infy.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.bean.CalculatorBean;
import com.infy.config.BeanConfiguration;

public class CalcUserInterface {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfiguration.class);
		CalculatorBean calc=ctx.getBean(CalculatorBean.class);
		calc.add(20, 50);
		calc.product(20, 50);
	}
	

}
