package com.ab.utilities;
import com.ab.daos.BasketDAO;
import com.ab.daos.BasketDAOImpl;
import com.ab.daos.BookDao;
import com.ab.daos.BookDaoImpl;
import com.ab.daos.CustomerDao;
import com.ab.daos.CustomerDaoImpl;
import com.ab.models.Book;
import com.ab.models.Customer;
import com.ab.services.BasketService;
import com.ab.services.BasketServiceImpl;
import com.ab.services.BookService;
import com.ab.services.BookServiceImpl;
import com.ab.services.CustomerService;
import com.ab.services.CustomerServiceImpl;

public class BSFactory {
	
	public static Customer getCustomer(String firstName,String lastName,String customerEmail,String customerPassword) {
			
		return new Customer(firstName, lastName, customerEmail, customerPassword);	
		
	}
	
	public static Customer getloginCustomer(String customerEmail,String customerPassword) {
		
		return new Customer(customerEmail, customerPassword);
	}
	
	public static CustomerDao getCustomerDao() {
		
		return new CustomerDaoImpl();
		
	}
	
	public static CustomerService getCustomerService(CustomerDao customerDao) {
			
		return new CustomerServiceImpl(customerDao);	
		
	}
	
	public static Book getBooks(int bookISBN,String bookTitle,String bookAuthor,double bookPrice) {
		
		return new Book(bookISBN, bookTitle, bookAuthor, bookPrice);
	}
	
	public static BookDao getBookDao() {
		
		return new BookDaoImpl();
	}
	
	public static BookService getBookService(BookDao bookDao) {
		
		return new BookServiceImpl(bookDao);
	}
	
	public static Book getBooks(int bookISBN) {
		
		return new Book(bookISBN);
	}
	
  public static Book getBooks(String bookTitle) {
		
		return new Book(bookTitle);
	}
  
  public static BasketDAO getBasketDAO() {
		
		return new BasketDAOImpl();
		
	}
  
  public static BasketService getBasketService(BasketDAO basketDAO) {
		
		return new BasketServiceImpl(basketDAO);
	}
	
}
