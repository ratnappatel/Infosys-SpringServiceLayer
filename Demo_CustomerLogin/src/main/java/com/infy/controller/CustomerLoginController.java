package com.infy.controller;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;
import com.infy.repository.CustomerLoginRepository;
import com.infy.repository.CustomerLoginRepositoryImpl;
import com.infy.service.CustomerLoginService;
import com.infy.service.CustomerLoginServiceImpl;

public class CustomerLoginController {

	private CustomerLoginService customerLoginService;

	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws InfyBankException {
		CustomerLoginRepository customerLoginRepository = new CustomerLoginRepositoryImpl();
		customerLoginService=new CustomerLoginServiceImpl(customerLoginRepository,"message dependecy");
		return customerLoginService.authenticateCustomer(customerLoginDTO);
	}
}
