package com.wyu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	
}
