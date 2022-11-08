package com.ab.utilities;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

import com.ab.models.Basket;
import com.ab.models.Book;

public class DataValidation {
	
	
   //password Encryption
	public static String encryptPassword(String customerPassword) {
		
            String encryptedpassword = null;
		try {	
			MessageDigest m = MessageDigest.getInstance("MD5");
			m.update(customerPassword.getBytes()); 
		
			byte[] bytes = m.digest(); 
			
			StringBuilder s = new StringBuilder();  
			
	        for(int i=0; i< bytes.length ;i++){  
	            s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));  
	        }  
	        encryptedpassword = s.toString();         
	       
	        return encryptedpassword;
	        
            }catch(NoSuchAlgorithmException e) {System.out.println(e);}
		
		     return null;	
	}
	
	//Email validation
    public static String validateEmail(String customerEmail) {
        if (customerEmail == null || customerEmail.isEmpty()) {
            return null;
        }
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +"[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (pattern.matcher(customerEmail).matches()) {
            return customerEmail;
        } 
            return null;
    }
    
    //decrease quantity
    
   public static void decreaseQty(String bookTitle) {
	   
	   Connection con;
		
	   PreparedStatement pst;
		
	   ResultSet rs;
		
		con = DatabaseConnection.getConnection();
		
		String query = "SELECT * FROM book WHERE bookTitle = ?" ;
		
		Book bs = null;
		
		try {
			
			 pst = con.prepareStatement(query);
			 pst.setString(1, bookTitle);
			 rs = pst.executeQuery();

			   if(rs.next()) {
				 
				 bs = new Book();
				 bs.setBookTitle(rs.getString("bookTitle"));
				 bs.setQuantity(rs.getInt("quantity"));
				 
				 String q2 = "UPDATE book SET quantity = ? WHERE bookTitle = ?";
				 
				 pst = con.prepareStatement(q2);
					
				 pst.setInt(1,bs.getQuantity()-1);
				 pst.setString(2,bs.getBookTitle());
									
				 pst.executeUpdate();
				 
					
			  }
			
			
		}catch (SQLException e) {
			  
		    System.out.println(e);
	       }
		
			
	}
	
	//restore Qty when deleting
   
 public static void restoreQty(String bookTitle) {
	   
	    Connection con;
		
	    PreparedStatement pst;
	   
	    PreparedStatement pst2;
		
	    ResultSet rs;
	   
	    ResultSet rs2;
		
		con = DatabaseConnection.getConnection();
		
		String query = "SELECT * FROM basket WHERE bookTitle = ?" ;
		
		Book bs = null;
		
		Book bs2 = null;
		
		try {
			
			   pst = con.prepareStatement(query);
			   pst.setString(1, bookTitle);
			   rs = pst.executeQuery();
	
			   if(rs.next()) {
				 
				 bs = new Book(rs.getString("bookTitle"),rs.getInt("quantity"));
				 
			    }
							 
				 String q1 = "SELECT * FROM book WHERE bookTitle = ?";
				 
				 pst2 = con.prepareStatement(q1);
				 pst2.setString(1, bookTitle);
				 rs2 = pst2.executeQuery();
				 
				if(rs2.next()) {
					
				 bs2 = new Book(rs2.getString("bookTitle"),rs2.getInt("quantity"));
		
				 }
				 
				 String q2 = "UPDATE book SET quantity = ? WHERE bookTitle = ?";
				 
				 pst = con.prepareStatement(q2);
					
				 pst.setInt(1,bs.getQuantity()+bs2.getQuantity());
				 pst.setString(2,bs.getBookTitle());
									
				 pst.executeUpdate();
			
		     }catch (SQLException e) {
			  
		       System.out.println(e);
	         }		
			
	}   
 
//  public static void calcTotal(String bookTitle) {
//	 
//	    Connection con;
//		
//	    PreparedStatement pst;
//		
//	    ResultSet rs;
//	   	    
//	    con = DatabaseConnection.getConnection();
//	    
//	    String query = "SELECT * FROM basket WHERE bookTitle = ?" ;
//		
//		
//	 
//		try {
//		      
//			
//			
//			
//			
//			   String query2 = "UPDATE basket SET total = ? WHERE bookTitle = ? ";
//			   
//	    	   pst = con.prepareStatement(query2);
//	    	   
//	    	   pst.setString(1, bookTitle);
//	    	   pst.setString(2, bookTitle);
//	    	   
//	    	   rs = pst.executeQuery();
//	    	   	   
//	    	   while(rs.next()) {
//	    		   		  
//	    		   Basket b = new Basket(rs.getDouble("total"));
//	    		      
//	    	    } 
//	    	    
//	    	  
//	       
//	           }catch(SQLException e) {
//	    	   
//	    	   System.out.println(e);
//	         }	
//				
//	 
//	 
//	 
// }
 
 
   

}
