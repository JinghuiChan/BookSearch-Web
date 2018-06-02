package com.wyu.entity;

public class BookType {
	private int bookType_id;
	private String bookType_name; 
	private int bookAddress_id;
	
	public BookType() {
		
	}

	public int getBookType_id() {
		return bookType_id;
	}

	public void setBookType_id(int bookType_id) {
		this.bookType_id = bookType_id;
	}

	public String getBookType_name() {
		return bookType_name;
	}

	public void setBookType_name(String bookType_name) {
		this.bookType_name = bookType_name;
	}

	public int getBookAddress_id() {
		return bookAddress_id;
	}

	public void setBookAddress_id(int bookAddress_id) {
		this.bookAddress_id = bookAddress_id;
	}
	
	
}
