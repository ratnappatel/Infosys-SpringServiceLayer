package com.infy.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import com.infy.bean.MyBean;
import com.infy.bean.WelcomeBean;


// Special class which is creating instance of beans on behalf of IOC container 
@Configuration
public class SpringConfig {
	
	// annotation @Bean marks this bean instance as 
	//spring bean instance to be injected /retrieved using BeanFactory/ApplicationContext object
	@Bean
	public WelcomeBean welcomeBean() {
		return new WelcomeBean();
	}
	
	@Bean
	public MyBean myBean()
	{
		return new MyBean();
	}
	
	

}