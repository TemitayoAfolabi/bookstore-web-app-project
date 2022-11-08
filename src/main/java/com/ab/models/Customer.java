package com.ab.models;

public class Customer {
	
	private int customerId;
	
	private String firstName;
	
	private String lastName;
	
	private String customerEmail;
	
	private String customerPassword;

	public Customer(int customerId, String firstName, String lastName, String customerEmail, String customerPassword) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
	}
	
	public Customer(String firstName, String lastName, String customerEmail, String customerPassword) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
	}

	public Customer(String customerEmail, String customerPassword) {
		super();
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
	}

	
	public Customer(int customerId, String firstName, String lastName, String customerEmail) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerEmail = customerEmail;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", customerEmail=" + customerEmail + "]";
	}
		

}


