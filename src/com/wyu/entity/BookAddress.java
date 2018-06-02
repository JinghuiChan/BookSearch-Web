package com.wyu.entity;

public class BookAddress {
	private int bookAddress_id;
	private String bookAddress_library; 
	private String bookAddress_floor;
	private String bookAddress_number;
	
	public BookAddress() {
		
	}

	public int getBookAddress_id() {
		return bookAddress_id;
	}

	public void setBookAddress_id(int bookAddress_id) {
		this.bookAddress_id = bookAddress_id;
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
	
	
}
