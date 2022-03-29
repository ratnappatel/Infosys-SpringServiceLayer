package com.infy.ui;

import java.util.Scanner;


import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.infy.controller.CustomerLoginController;
import com.infy.dto.CustomerLoginDTO;

public class UserInterface {

	private static final Log LOGGER = LogFactory.getLog(UserInterface.class);
	
	public static void main(String[] args) throws Exception {
		
		PropertiesConfiguration config = new Configurations().properties("configuration.properties");
		try {
			CustomerLoginDTO customerLoginDTO = new CustomerLoginDTO();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Login Name : ");
			String loginName=sc.next();
			
			System.out.println("Enter Login Password : ");
			String loginPassword=sc.next();
			
			customerLoginDTO.setLoginName(loginName);
			customerLoginDTO.setPassword(loginPassword);
			
			CustomerLoginController customerLoginController = new CustomerLoginController();
			String message = customerLoginController.authenticateCustomer(customerLoginDTO);
			LOGGER.info(config.getProperty(message));
		} catch (Exception exception) {
			LOGGER.info(config.getProperty(exception.getMessage()));
		}
	}
}
