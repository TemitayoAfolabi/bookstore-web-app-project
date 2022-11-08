package com.ab.services;
import java.util.List;
import com.ab.models.Book;

public interface BookService {
	
	public List<Book> viewBooks();
	public Book searchBook(Book books);
	public Book readBookInformation(String bookTitle);

}
