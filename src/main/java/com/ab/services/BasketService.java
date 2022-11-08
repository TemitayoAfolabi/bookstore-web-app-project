package com.ab.services;
import java.util.List;
import com.ab.models.Basket;

public interface BasketService {
	
	public Basket basketAdd(String bookTitle);
	public Basket addBook(String bookTitle); //problem
	public List<Basket> viewBasket();
	public Basket modifyBasket(String bookTitle);
	public boolean checkout(boolean status);

}
