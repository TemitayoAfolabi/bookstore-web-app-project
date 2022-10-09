package com.ab.services;

import com.ab.daos.CustomerDao;
import com.ab.models.Customer;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDAO;
	
	public CustomerServiceImpl(CustomerDao customerDAO) {
		
		this.customerDAO = customerDAO;
		
	}
	
	

	@Override
	public Customer registerCustomer(Customer customer) {
		
		//try to encrypt customer password before sending customer details to DAO
		return this.customerDAO.registerCustomer(customer);
		
	}

	@Override
	public String loginProcess(String customerEmail, String customerPassword) {
		// TODO Auto-generated method stub
		return this.customerDAO.loginProcess(customerEmail, customerPassword);
	}

}
