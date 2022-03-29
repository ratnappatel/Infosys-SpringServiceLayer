package com.infy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.infy.bean com.infy.service")
@PropertySource("classpath:messages.properties")
public class SpringConfig {

}
