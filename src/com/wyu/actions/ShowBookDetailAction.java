package com.wyu.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.wyu.entity.SearchResult;
import com.wyu.service.SearchService;

public class ShowBookDetailAction extends ActionSupport {
	private int id;
	SearchResult book = new SearchResult();
	List<SearchResult> books = new ArrayList<SearchResult>();
	private SearchService searchService = new SearchService();
	
	public ShowBookDetailAction() {
		
	}
	
	public SearchResult getBook() {
		return book;
	}

	public void setBook(SearchResult book) {
		this.book = book;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<SearchResult> getBooks() {
		return books;
	}
	public void setBooks(List<SearchResult> books) {
		this.books = books;
	}
	public SearchService getSearchService() {
		return searchService;
	}
	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}
	
	public String search() {
		books = searchService.findBooksByBookID(id);
		if(books.size() > 0) {
			book = books.get(0);
			return SUCCESS;
		}
		return INPUT;
	}
	
}
