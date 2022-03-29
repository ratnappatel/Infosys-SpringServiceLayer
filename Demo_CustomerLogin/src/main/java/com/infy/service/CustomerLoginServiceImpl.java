package com.infy.service;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;
import com.infy.repository.CustomerLoginRepository;
import com.infy.repository.CustomerLoginRepositoryImpl;

public class CustomerLoginServiceImpl implements CustomerLoginService {

	//@Autowired
	private CustomerLoginRepository customerLoginRepository;
	// Dependency injection
	
	public CustomerLoginServiceImpl(CustomerLoginRepository customerLoginRepository,String msg) {
		this.customerLoginRepository=customerLoginRepository;
	}

	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws InfyBankException {
		String toReturn = null;
		
		CustomerLoginDTO customerLoginFromRepository = 
				customerLoginRepository.getCustomerLoginByLoginName(customerLoginDTO.getLoginName());
		if (customerLoginDTO.getPassword().equals(customerLoginFromRepository.getPassword())) {
			toReturn = "SUCCESS";
		} else {
			throw new InfyBankException("Service.WRONG_CREDENTIALS");
		}
		return toReturn;
	}
}