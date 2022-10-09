 package com.ab.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ab.models.Customer;
import com.ab.utilities.DatabaseConnection;

public class CustomerDaoImpl implements CustomerDao{
	
	private Connection con;
	
	private PreparedStatement pst;
	
	private ResultSet rs;
	

	
	@Override
	public Customer registerCustomer(Customer customer) {
		
		con = DatabaseConnection.getConnection();
		

		
		String query = "INSERT into customers(first_name, last_name, customer_email, customer_password) VALUES(?,?,?,?)";
		 
		try {
			
		
		pst = con.prepareStatement(query);
		
		pst.setString(1, customer.getFirstName());
		
		pst.setString(2, customer.getLastName());
		
		pst.setString(3, customer.getCustomerEmail());
		
		pst.setString(4, customer.getCustomerPassword());
		
		
		
		int i = pst.executeUpdate();
		
		if (i > 0) {
			
			return customer;
		}
		else {
			
			return null;
		}
		
			}
		catch(SQLException e){
			
			System.out.println(e);
			
			}
		
		return null;
	}
	
	
	

	@Override
	public String loginProcess(String customerEmail, String customerPassword) {
		
		String loginStatus = null;
				
		con = DatabaseConnection.getConnection();
		
		String query = "SELECT * from customers WHERE customer_email = ? AND customer_password = ?";
		
		try {
		pst = con.prepareStatement(query);
		
		pst.setString(1, customerEmail);
		
		pst.setString(1, customerPassword);
		
		
		rs = pst.executeQuery();
		
		if (rs.next()) {
			loginStatus = "success";
		}
		else {
			loginStatus = "failed";
		}
		
		}
		catch(SQLException e){
			
			System.out.println(e);
			
			} 
		return loginStatus;
	}
 
	
}
