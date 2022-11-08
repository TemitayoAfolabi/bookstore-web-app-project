package com.ab.models;

public class Book {

	private int bookISBN;
	
	private String bookTitle;
	
	private String bookAuthor;
	
	private double bookPrice;
	
	private int quantity;
	
	
	
	public Book() {
		super();
	}

	public Book(int bookISBN, String bookTitle, String bookAuthor, double bookPrice, int quantity) {
		super();
		this.bookISBN = bookISBN;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.quantity = quantity;
	}

	public Book(int bookISBN, String bookTitle, String bookAuthor, double bookPrice) {
		super();
		this.bookISBN = bookISBN;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}

	public Book(int bookISBN, String bookTitle) {
		super();
		this.bookISBN = bookISBN;
		this.bookTitle = bookTitle;
	}
	
	public Book(int bookISBN) {
		super();
		this.bookISBN = bookISBN;
		
	}
	public Book(String bookTitle) {
		super();
		this.bookTitle = bookTitle;
		
	}

	public Book(String bookTitle, int quantity) {
		super();
		this.bookTitle = bookTitle;
		this.quantity = quantity;
	}

	public int getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(int bookISBN) {
		this.bookISBN = bookISBN;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Book [bookISBN=" + bookISBN + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookPrice="
				+ bookPrice + "]";
	}
	
	
}
