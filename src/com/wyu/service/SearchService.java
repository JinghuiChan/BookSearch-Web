package com.wyu.service;

import java.util.ArrayList;
import java.util.List;

import com.wyu.dao.QueryDAO;
import com.wyu.entity.Book;
import com.wyu.entity.SearchResult;

public class SearchService {
	private QueryDAO queryDAO = new QueryDAO();
	
	
	public QueryDAO getQueryDAO() {
		return queryDAO;
	}


	public void setQueryDAO(QueryDAO queryDAO) {
		this.queryDAO = queryDAO;
	}


	public SearchService() {
		
	}
	
	public List<SearchResult> findBooksByBookname(String searchContent){
		List<SearchResult> books = new ArrayList<SearchResult>();
		books = queryDAO.findResultByBookName(searchContent) ;
		return books;
	}
	
	public List<SearchResult> findBooksByBookID(int id){
		List<SearchResult> books = new ArrayList<SearchResult>();
		books = queryDAO.findResultByBookID(id) ;
		return books;
	}
	
	/*
	public List<Book> findBooks(String searchContent){
		
	}
	*/
}
