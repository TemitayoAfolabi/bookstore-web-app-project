package com.ab.services;
import com.ab.models.Customer;

public interface CustomerService {
	
	public Customer registerCustomer(Customer customer);
	public Customer loginCustomer(String customerEmail,String customerPassword);

}
