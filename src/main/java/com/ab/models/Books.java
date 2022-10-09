package com.ab.models;

public class Books {

	private int bookID;
	private String title;
	private String author;
	private String overview;
	private double amount;
	public Books(int bookID, String title, String author, String overview, double amount) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.overview = overview;
		this.amount = amount;
	}
	
	public Books(int bookID, String title, double amount) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.amount = amount;
		
	}
	
	
	public int getBookID() {
		return bookID;
	}
	
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getOverview() {
		return overview;
	}
	
	public void setOverview(String overview) {
		this.overview = overview;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	@Override
	public String toString() {
		return "Books [bookID=" + bookID + ", title=" + title + ", author=" + author + ", overview=" + overview
				+ ", amount=" + amount + "]";
	}
	
	
	
	
	
}
