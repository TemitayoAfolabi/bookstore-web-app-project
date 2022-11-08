package com.ab.models;

import java.util.List;

public class Account {

	private int accountId;
	
	private Customer customer;
	
	private List<Order> orders;
	
	private String billingAddress;
	
	private boolean accountStatus; //closed or opened=true

	public Account(int accountId, Customer customer,List<Order> orders, String billingAddress, boolean accountStatus) {
		super();
		this.accountId = accountId;
		this.customer = customer;
		this.orders = orders;
		this.billingAddress = billingAddress;
		this.accountStatus = accountStatus;
	}

	public int getAccountId() {
		return accountId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public boolean isAccountStatus() {
		return accountStatus;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public void setAccountStatus(boolean accountStatus) {
		this.accountStatus = accountStatus;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", customer=" + customer + ", orders=" + orders + ", billingAddress="
				+ billingAddress + ", accountStatus=" + accountStatus + "]";
	}
	
	
	

	
	
	
}
