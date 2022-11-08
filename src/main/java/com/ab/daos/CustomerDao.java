package com.ab.daos;
import com.ab.models.Customer;

public interface CustomerDao {
	
	public Customer registerCustomer(Customer customer);
	public Customer loginCustomer(String customerEmail,String customerPassword);
		 
}
