package com.ab.services;
import java.util.List;
import com.ab.daos.BasketDAO;
import com.ab.models.Basket;
import com.ab.models.Book;

public class BasketServiceImpl implements BasketService {

	private BasketDAO basketDAO;
	
	
	public BasketServiceImpl(BasketDAO basketDAO) {
		super();
		this.basketDAO = basketDAO;
	}

	@Override
	public Basket basketAdd(String bookTitle) {
		
		return this.basketDAO.basketAdd(bookTitle);
	}
	@Override
	public Basket addBook(String bookTitle) {
		
		return this.basketDAO.addBook(bookTitle);
	}

	@Override
	public List<Basket> viewBasket() {
		// TODO Auto-generated method stub
		return this.basketDAO.viewBasket();
	}

	@Override
	public Basket modifyBasket(String bookTitle) {
		// TODO Auto-generated method stub
		return this.basketDAO.modifyBasket(bookTitle);
	}

	@Override
	public boolean checkout(boolean status) {
		// TODO Auto-generated method stub
		return false;
	}

}
