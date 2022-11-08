package com.ab.models;
import java.util.List;

public class Order {

	private int orderId;
	
	private List<Book> books;
	
	private int quantity;
	
	private Account accounts;
    
    private enum orderStatus {
    	CANCELED("canceled"),SHOPPINGCART("Shoppingcart"),CHECKOUT("Checkout"),PENDING("Pending"),COMPLETED("Completed");
    	
    	private String action;
    	
    	private orderStatus(String action) {
        	
        	this.action = action;
        }
    
    	 public String getAction(){
    	    	
    	        return this.action;
    	    }    
    }
    
	public Order(int orderId, List<Book> books,int quantity, Account accounts) {
		super();
		this.orderId = orderId;
		this.books = books;
		this.quantity = quantity;
		this.accounts = accounts;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Account getAccounts() {
		return accounts;
	}

	public void setAccounts(Account accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", books=" + books + ", quantity=" + quantity + ", accounts=" + accounts + "]";
	}
     

	
	
	
}
