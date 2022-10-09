package com.ab.daos;

import java.util.List;

import com.ab.models.Books;

public interface BookDao {
	
	public List<Books> loadBooks();
	
}
