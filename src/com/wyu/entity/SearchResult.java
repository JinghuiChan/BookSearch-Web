package com.wyu.entity;
public class SearchResult {
	private int bookID;
	private String bookName;
	private String author;
	private String publish;
	private String bookType;
	private String bookCount;
	private String bookNumber;
	private String isbn;
	private String price;
	private String bookAddress_library;
	private String bookAddress_floor;
	private String bookAddress_number;
	
	public SearchResult() {
		
	}
	
	
	public int getBookID() {
		return bookID;
	}


	public void setBookID(int bookID) {
		this.bookID = bookID;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public String getBookCount() {
		return bookCount;
	}

	public void setBookCount(String bookCount) {
		this.bookCount = bookCount;
	}

	public String getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookAddress_library() {
		return bookAddress_library;
	}

	public void setBookAddress_library(String bookAddress_library) {
		this.bookAddress_library = bookAddress_library;
	}

	public String getBookAddress_floor() {
		return bookAddress_floor;
	}

	public void setBookAddress_floor(String bookAddress_floor) {
		this.bookAddress_floor = bookAddress_floor;
	}

	public String getBookAddress_number() {
		return bookAddress_number;
	}

	public void setBookAddress_number(String bookAddress_number) {
		this.bookAddress_number = bookAddress_number;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
