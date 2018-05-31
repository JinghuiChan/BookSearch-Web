package com.wyu.service;

import java.util.ArrayList;
import java.util.List;

import com.wyu.dao.QueryDAO;
import com.wyu.entity.User;

public class UserService {
	private QueryDAO queryDao = new QueryDAO();
	private User user = new User();
	private boolean flag = false;
	
	public QueryDAO getQueryDao() {
		return queryDao;
	}
	public void setQueryDao(QueryDAO queryDao) {
		this.queryDao = queryDao;
	}
	
	public boolean checkLogin(User inputUser) {
		user = queryDao.findByUsernameApwd(inputUser);
		if(user != null) {
			flag = true;
		}
		return flag;
	}
	
}
