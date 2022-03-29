package com.infy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.infy.bean.CalculatorBean;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public CalculatorBean calculatorBean()
	{
		return new CalculatorBean();
	}

}
