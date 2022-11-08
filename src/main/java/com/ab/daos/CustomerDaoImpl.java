package com.ab.daos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ab.models.Customer;
import com.ab.utilities.BSFactory;
import com.ab.utilities.DatabaseConnection;

public class CustomerDaoImpl implements CustomerDao{

	private static Connection con;
	
	private PreparedStatement pst;
	
	private ResultSet rs;
	
	
	@Override
	public Customer registerCustomer(Customer customer) {
		
		con = DatabaseConnection.getConnection();
	
		String query = "INSERT INTO Customer (firstName,lastName,customerEmail,customerPassword) VALUES(?,?,?,?) ";
		
		try {
		
		pst = con.prepareStatement(query);
		pst.setString(1, customer.getFirstName());
		pst.setString(2, customer.getLastName());
		pst.setString(3, customer.getCustomerEmail());
		pst.setString(4, customer.getCustomerPassword());
		
		int i = pst.executeUpdate();
		
		if (i >0) {
			
			return customer;
		}
		
	    }catch(SQLException e) {
		 
		 System.out.println(e);			 
     }			
		
		return null;
	}
		
	
	@Override
	public Customer loginCustomer(String customerEmail, String customerPassword) {
		
		con = DatabaseConnection.getConnection();
		
		String query = "SELECT customerEmail, customerPassword FROM Customer WHERE customerEmail = ? AND customerPassword = ? ;";
		
		
		try {
		
		pst = con.prepareStatement(query);
		pst.setString(1, customerEmail);
		pst.setString(2, customerPassword);
		
		rs = pst.executeQuery();
		
		while(rs.next()) {
		
		Customer customer = BSFactory.getloginCustomer(rs.getString("customerEmail"), rs.getString("customerPassword"));
		
		return customer;
		
		}
	    }catch(SQLException e) {
		 
		 System.out.println(e);
		 
        }			
		
		return null;
	}
	

}
