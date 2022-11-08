package com.ab.services;
import java.util.List;
import com.ab.daos.BookDao;
import com.ab.models.Book;

public class BookServiceImpl implements BookService {
	
	private BookDao bookDao;
	
	public BookServiceImpl(BookDao bookDao) {
		super();
		this.bookDao = bookDao;
	}

	@Override
	public List<Book> viewBooks() {
		
		return this.bookDao.viewBooks();
	}

	@Override
	public Book searchBook(Book books) {
		
		return this.bookDao.searchBook(books);
	}

	@Override
	public Book readBookInformation(String bookTitle) {
		
		return this.bookDao.readBookInformation(bookTitle);
	}

}
