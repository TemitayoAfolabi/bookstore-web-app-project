package com.ab.services;
import com.ab.daos.CustomerDao;
import com.ab.models.Customer;
import com.ab.utilities.BSFactory;
import com.ab.utilities.DataValidation;

public class CustomerServiceImpl implements CustomerService{

	
	private CustomerDao customerDao;
	
	public CustomerServiceImpl(CustomerDao customerDAO) {
		
		super();
		this.customerDao = customerDao;
		
	}
	
	@Override
	public Customer registerCustomer(Customer customer) {
		
		String password = customer.getCustomerPassword();
		String email = customer.getCustomerEmail();
		
		String encryptedPassword = DataValidation.encryptPassword(password);
		
		String validatedEmail = DataValidation.validateEmail(email);
		     
	    Customer cus = BSFactory.getCustomer(customer.getFirstName(), customer.getLastName(), validatedEmail, encryptedPassword);
	        
	    return BSFactory.getCustomerDao().registerCustomer(cus);
	        		
	}

	@Override
	public Customer loginCustomer(String customerEmail, String customerPassword) {
		
		String password = customerPassword;
		String email = customerEmail;
		
		String encryptedPassword = DataValidation.encryptPassword(password);
		
		String validatedEmail = DataValidation.validateEmail(email);
		
		return BSFactory.getCustomerDao().loginCustomer(validatedEmail, encryptedPassword);
	
	}


}
