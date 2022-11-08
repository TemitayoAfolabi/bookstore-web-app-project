package com.ab.models;


public class Basket {
	
	private int basketId;
	
	private String  bookTitle;
	
	private double bookPrice;
	
	private int quantity;
	
	private double total;
	
	

	public Basket(String bookTitle, double bookPrice, int quantity, double total) {
		super();
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		this.quantity = quantity;
		this.total = total;
	}

	public Basket(double total) {
		super();
		this.total = total;
	}

	public Basket(int basketId, String bookTitle) {
		super();
		this.basketId = basketId;
		this.bookTitle = bookTitle;
	}
	
	public Basket(String bookTitle) {
		super();
		this.bookTitle = bookTitle;
	}
	
	public Basket() {
		super();
		
	}
	

	public Basket(String bookTitle, double bookPrice, int quantity) {
		super();
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		this.quantity = quantity;
	}

	public void setBasketId(int basketId) {
		this.basketId = basketId;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getBasketId() {
		return basketId;
	}

	public String getBookTitle() {
		return bookTitle;
	}
	
	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Basket [basketId=" + basketId + ", bookTitle=" + bookTitle + "]";
	}
		
	
}
