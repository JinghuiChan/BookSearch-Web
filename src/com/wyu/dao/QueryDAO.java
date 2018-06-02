package com.wyu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.wyu.entity.Book;
import com.wyu.entity.SearchResult;
import com.wyu.entity.User;
import com.wyu.dao.BaseDAO;

public class QueryDAO {
	private Connection conn = BaseDAO.getConnection();
	private ResultSet rs;
	private PreparedStatement ps;
	private User user;
	boolean flag = false;

	public QueryDAO() {
		
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public User findByUsernameApwd(User user){
		String sql = "select * from t_user where user_name=? and user_passwd=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserPasswd());
			rs = ps.executeQuery();
			if(rs.next()) {
				user.setUserId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setUserName(rs.getString(3));
				flag = true;
			}
		}catch (Exception e) {
			System.out.println("通过用户名和密码查询用户失败！");
			e.printStackTrace();
			}
		return user;
	}
	
	public List<Book> findBookByBookName(String bookName) {
		List<Book> books = new ArrayList<Book>();
		String sql = "select * from t_book where book_name like"+"' %"+bookName+"%'";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, bookName);
			rs = ps.executeQuery();
			if(rs.next()) {
				books = (List<Book>) rs;
			}
		}catch  (Exception e) {
			System.out.println("通过书名查询图书失败！");
			e.printStackTrace();
		}
		return books;
	}
	
	public List<SearchResult> findResultByBookName(String searchContent) {
		List<SearchResult> books = new ArrayList<SearchResult>();
		//String sql1 = "select * from t_book where book_name like"+"' %"+searchContent+"%'";
		String sql  = "select book_name,author_name,publish_name,bookType_name,book_sum,book_number,bookAddress_library,bookAddress_floor,bookAddress_number,book_isbn,book_price,book_id"
						+" from t_book tb,t_author,t_bookAddress,t_publish,t_bookType"
						+" where tb.book_name like ? " 
						+" or t_author.author_name like ? "
						+" or t_publish.publish_name like ? "
						+" or tb.book_number like ? "
						+" or tb.book_isbn like ? "
						+" group by tb.book_id";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+searchContent+"%");
			ps.setString(2, "%"+searchContent+"%");
			ps.setString(3, "%"+searchContent+"%");
			ps.setString(4, "%"+searchContent+"%");
			ps.setString(5, "%"+searchContent+"%");
			rs = ps.executeQuery();
			while(rs.next()) {
				SearchResult book = new SearchResult();
				book.setBookName(rs.getString(1));
				book.setAuthor(rs.getString(2));
				book.setPublish(rs.getString(3));
				book.setBookType(rs.getString(4));
				book.setBookCount(rs.getString(5));			
				book.setBookNumber(rs.getString(6));
				book.setBookAddress_library(rs.getString(7));
				book.setBookAddress_floor(rs.getString(8));
				book.setBookAddress_number(rs.getString(9));
				book.setIsbn(rs.getString(10));
				book.setPrice(rs.getString(11));
				book.setBookID(rs.getInt(12));
				books.add(book);
			}
			rs.close();
			ps.close();
			conn.close();
		}catch  (Exception e) {
			System.out.println("通过查询内容查询图书失败！");
			e.printStackTrace();
		}
		return books;
	}
	
	public List<SearchResult> findResultByBookID(int id) {
		List<SearchResult> books = new ArrayList<SearchResult>();
		//String sql1 = "select * from t_book where book_name like"+"' %"+searchContent+"%'";
		String sql  = "select book_name,author_name,publish_name,bookType_name,book_sum,book_number,bookAddress_library,bookAddress_floor,bookAddress_number,book_isbn,book_price,book_id"
						+" from t_book tb,t_author,t_bookAddress,t_publish,t_bookType"
						+" where tb.book_id like ? " 
						+" group by tb.book_id";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+id+"%");
			rs = ps.executeQuery();
			while(rs.next()) {
				SearchResult book = new SearchResult();
				book.setBookName(rs.getString(1));
				book.setAuthor(rs.getString(2));
				book.setPublish(rs.getString(3));
				book.setBookType(rs.getString(4));
				book.setBookCount(rs.getString(5));			
				book.setBookNumber(rs.getString(6));
				book.setBookAddress_library(rs.getString(7));
				book.setBookAddress_floor(rs.getString(8));
				book.setBookAddress_number(rs.getString(9));
				book.setIsbn(rs.getString(10));
				book.setPrice(rs.getString(11));
				book.setBookID(rs.getInt(12));
				books.add(book);
			}
			rs.close();
			ps.close();
			conn.close();
		}catch  (Exception e) {
			System.out.println("通过查询内容查询图书失败！");
			e.printStackTrace();
		}
		return books;
	}
	
}
