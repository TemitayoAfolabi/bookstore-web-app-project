package com.ab.services;

import java.util.List;

import com.ab.daos.BookDao;
import com.ab.models.Books;

public class BookServiceImpl implements BookService {
	
	private BookDao bookDAO;

	public BookServiceImpl(BookDao dao) {
		this.bookDAO = bookDAO;
	}

	@Override
	public List<Books> loadBooks() {
		
		return this.bookDAO.loadBooks();
	}

}
