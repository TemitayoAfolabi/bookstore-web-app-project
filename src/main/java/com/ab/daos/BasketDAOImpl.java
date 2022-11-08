package com.ab.daos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ab.models.Basket;
import com.ab.models.Book;
import com.ab.utilities.DatabaseConnection;

public class BasketDAOImpl implements BasketDAO {

    private Connection con;
	
	private PreparedStatement pst;
	
	private PreparedStatement pst2;
	
	private ResultSet rs;
	
	private ResultSet rs2;
	
	
	@Override
	public Basket basketAdd(String bookTitle) {
		
        con = DatabaseConnection.getConnection();
		
		String query = "SELECT * FROM book WHERE bookTitle = ?" ;
		
		String q = "SELECT * FROM basket WHERE bookTitle = ?" ;
		
		Basket bs = null;

		
		 try {
 			    
			    pst = con.prepareStatement(query);
			    pst.setString(1, bookTitle);
			    rs = pst.executeQuery();
			    
			    pst2 = con.prepareStatement(q);
				pst2.setString(1, bookTitle);	
				rs2 = pst2.executeQuery();
							
				if(rs2.next()) {
				
				bs = new Basket(rs2.getString("bookTitle"),rs2.getDouble("bookPrice"),rs2.getInt("quantity"));
				
				String q2 = "UPDATE basket SET quantity = ? WHERE bookTitle = ?";
								
				pst = con.prepareStatement(q2);
						
				pst.setInt(1,bs.getQuantity()+1);
				pst.setString(2,bs.getBookTitle());
								
				pst.executeUpdate();
				
				
				return bs;
				
				}
				else {
				
				if(rs.next()) {
			    bs = new Basket(rs.getString("bookTitle"),rs.getDouble("bookPrice"),rs.getInt("quantity"));
				
				String query1 = "INSERT INTO basket (bookTitle,bookPrice,quantity) VALUES(?,?,?) ";	
				
				pst = con.prepareStatement(query1);
     		    
				pst.setString(1,bs.getBookTitle());
				pst.setDouble(2, bs.getBookPrice());
				pst.setInt(3, 1);
					
			    pst.executeUpdate();	
			    
			    
			    return bs;
				
				}
				}
		        }catch (SQLException e) {
					  
				    System.out.println(e);
			       }
		return bs;
					
	}

    @Override
	public Basket addBook(String bookTitle) { //unused function refer basketAdd function
		
		con = DatabaseConnection.getConnection();
		
		String query = "SELECT * FROM basket WHERE bookTitle = ?" ;
		
		Basket basket = new Basket(bookTitle);
		
		 try {
 			 
			    pst = con.prepareStatement(query);
			    
				pst.setString(1, basket.getBookTitle());
				
				rs = pst.executeQuery();
				
				
				if(rs.next()) {
				
				Basket b = new Basket(rs.getString("bookTitle"));

				
				return b;
				
				}else {
					
				String query1 = "INSERT INTO basket (bookTitle) VALUES(?) ";							
				
                pst = con.prepareStatement(query1);
                		    
				pst.setString(1,basket.getBookTitle());
				
				int i = pst.executeUpdate();
				
				//System.out.println(i);
				
				if (i > 0) {
					
					return basket;
				} 
				}
				
				}catch (SQLException e) {
					  
				    System.out.println(e);
			       }
		 
				return 	basket;	     							
				
	} 	
		
		
	@Override
	public List<Basket> viewBasket() {

		con = DatabaseConnection.getConnection();
	       
	     String query = "SELECT * FROM basket";
	       
	       List<Basket> bList = new ArrayList<>();
	       
	       try {
	      
	    	   pst = con.prepareStatement(query);
	    	   
	    	   rs = pst.executeQuery();
	    	   	   
	    	   while(rs.next()) {
	    		   		  
	    		   Basket b = new Basket(rs.getString("bookTitle"),rs.getDouble("bookPrice"),rs.getInt("quantity"));
	    		   bList.add(b);
	    		       		   
	    	    } 
	    	   
	       
	           }catch(SQLException e) {
	    	   
	    	   System.out.println(e);
	         }	
	      
	       
	       return bList;
		}
		

	@Override
	public Basket modifyBasket(String bookTitle) {
		
		con = DatabaseConnection.getConnection();
		
		String query = "DELETE FROM basket WHERE bookTitle = ? ";
		
		Basket basket = new Basket(bookTitle);
		
		 try {
			 			 
			    pst = con.prepareStatement(query);
			    
				pst.setString(1, basket.getBookTitle());
				
				int i = pst.executeUpdate();
				
				//System.out.println(i);
				
				if (i > 0) {
					
					return basket;
				} 
			 
		        }catch (SQLException e) {
			  
			    System.out.println(e);
		       }	
		
		return basket;
	}

	@Override
	public List<Book> checkout(List<Basket> basket) {
		
       con = DatabaseConnection.getConnection();
		
		String query = "UPDATE basket SET total = ? WHERE bookTitle = ? ";
		
		List<Book> bList = new ArrayList();
		
		try {
		      
	    	   pst = con.prepareStatement(query);
	    	   
	    	   pst.setString(1, ((Basket) basket).getBookTitle());
	    	   
	    	   rs = pst.executeQuery();
	    	   	   
	    	   while(rs.next()) {
	    		   		  
	    		   Book b = new Book(rs.getInt("bookISBN"),rs.getString("BookTitle"),rs.getString("bookAuthor"),rs.getDouble("bookPrice"));
	    		   
	    		   bList.add(b);	   
	    	    } 
	    	    
	    	   return bList;
	       
	           }catch(SQLException e) {
	    	   
	    	   System.out.println(e);
	         }	
				
		return bList;
	}
	
	
	

}
