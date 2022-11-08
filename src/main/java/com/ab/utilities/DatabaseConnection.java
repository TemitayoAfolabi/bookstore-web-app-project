package com.ab.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static Connection con;
	
	 private DatabaseConnection() {
		
	}
	
	public static Connection getConnection() {
	
		if(con == null) {
			
			try {
			
				Class.forName("com.mysql.cj.jdbc.Driver");
	
				con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
			}
			catch (ClassNotFoundException e) {
				System.out.println (e); 
			}
			catch(SQLException e) {
				System.out.println (e);
			}
			
		}
		return con;
	}

}
