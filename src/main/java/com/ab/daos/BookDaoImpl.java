package com.ab.daos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ab.models.Book;
import com.ab.utilities.BSFactory;
import com.ab.utilities.DatabaseConnection;

public class BookDaoImpl implements BookDao {

	private Connection con;
	
	private PreparedStatement pst;
	
	private ResultSet rs;
	
	
	@Override
	public List<Book> viewBooks() {

       con = DatabaseConnection.getConnection();
       
       String query = "SELECT bookTitle FROM book";
       
       List<Book> bList = new ArrayList<>();
       
       try {
      
    	   pst = con.prepareStatement(query);
    	   
    	   rs = pst.executeQuery();
    	   	   
    	   while(rs.next()) {
    		   		  
    		   Book b = BSFactory.getBooks(rs.getString("bookTitle"));
    		   bList.add(b);
    		       		   
    	    } 
    	   
       
           }catch(SQLException e) {
    	   
    	   System.out.println(e);
         }	
      
       return bList;
	}

	@Override
	public Book searchBook(Book books){
		
		con = DatabaseConnection.getConnection();
		
		 String query = "SELECT bookISBN,bookTitle FROM book WHERE bookISBN = ?";
		
		 Book book = new Book();
		 
		 try {
		      
	    	   pst = con.prepareStatement(query);
	    	   
	    	   pst.setInt(1,books.getBookISBN());
	    	   
	    	   rs = pst.executeQuery();
	    	   
	    	     
				
				if (rs.next()) {
						        	
					book.setBookISBN(rs.getInt("bookISBN"));
					book.setBookTitle(rs.getString("bookTitle"));
					
		        
					return book;
				}
	    	   
		  }catch (SQLException e) {
			  
			 System.out.println(e);
		  }
	
		return book;
	}

	@Override
	public Book readBookInformation(String bookTitle) {
		
		con = DatabaseConnection.getConnection();
		
		 String query = "SELECT * FROM book WHERE bookTitle = ?";
		 
		 Book book = new Book();
		
		 try {
		      
	    	   pst = con.prepareStatement(query);
	    	   
	    	   pst.setString(1,bookTitle);
	    	   
	    	   rs = pst.executeQuery();
				
				if (rs.next()) {
						
					book.setBookISBN(rs.getInt("bookISBN"));
					book.setBookTitle(rs.getString("bookTitle"));
					book.setBookAuthor(rs.getString("bookAuthor"));
					book.setBookPrice(rs.getDouble("bookPrice"));
					book.setQuantity(rs.getInt("quantity"));
		        
				return book;
				}
	    	   
		  }catch (SQLException e) {
			  
			 System.out.println(e);
		  }
			
		return book;
	}

}
