package com.user;


public class Book {
	
	private int bookIsbnNo;
	private String author;
	private String publisher;
	private float price;

	public Book() {
		
	}
	
	public Book(int no, String author, String publisher, float price) {
		super();
		this.bookIsbnNo = no;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}

	public int getBookIsbnNo() {
		return bookIsbnNo;
	}

	public void setBookIsbnNo(int bookIsbnNo) {
		this.bookIsbnNo = bookIsbnNo;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
