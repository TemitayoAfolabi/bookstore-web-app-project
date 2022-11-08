package com.ab.daos;
import java.util.List;
import com.ab.models.Basket;
import com.ab.models.Book;

public interface BasketDAO {
	
	public Basket addBook(String bookTitle); 
	public Basket basketAdd(String bookTitle);
	public List<Basket> viewBasket();
	public Basket modifyBasket(String bookTitle);
	public List<Book> checkout(List<Basket> basket);

}
