package com.ab.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ab.models.Books;
import com.ab.utilities.DatabaseConnection;

public class BookDaoImpl implements BookDao {
	
	private Connection con;
	
	private PreparedStatement pst;
	
	private ResultSet rs;

	@Override
	public List<Books> loadBooks() {
		
		
		con = DatabaseConnection.getConnection();
		
		String query = "SELECT book_id, title, amount from books";
		
		try {
		pst = con.prepareStatement(query);
		
		rs = pst.executeQuery();
		
		List<Books> bList = new ArrayList<>();
		
		while(rs.next()) {
			
			Books b = new Books(rs.getInt("book_id"), 
								rs.getString("title"), 
								rs.getDouble("amount"));
			
			bList.add(b);
			
			
		}
		
		return bList;
		
		}
		catch (SQLException e) {
			System.out.println(e);
		}
		
		
		
		return null;
	}

}
