package com.wyu.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.wyu.entity.Book;
import com.wyu.entity.SearchResult;
import com.wyu.service.SearchService;

public class SearchSubmitAction extends ActionSupport {
	private boolean hasBooks = false;
	private String searchContent;
	List<SearchResult> books = new ArrayList<SearchResult>();
	private SearchService searchService = new SearchService();
	
	public String getSearchContent() {
		return searchContent;
	}
	public void setSearchContent(String searchContent) {
		this.searchContent = searchContent;
	}
	public SearchService getSearchService() {
		return searchService;
	}
	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}	
	
	public List<SearchResult> getBooks() {
		return books;
	}
	public void setBooks(List<SearchResult> books) {
		this.books = books;
	}
	
	public boolean isHasBooks() {
		return hasBooks;
	}
	public void setHasBooks(boolean hasBooks) {
		this.hasBooks = hasBooks;
	}
	public SearchSubmitAction() {
		
	}
	
	public String search() {
		books = searchService.findBooksByBookname(searchContent);
		if(books.size() > 0) {
			hasBooks = true;
			return SUCCESS;
		}
		return INPUT;
	}
}
