package com.wyu.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.wyu.entity.User;
import com.wyu.service.UserService;

public class LoginAction extends ActionSupport {
	private User user = new User();
	private String username;
	private String password;
	private UserService userService = new UserService();
	
	
	public LoginAction() {
		
	}

	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login() {
		user.setUserName(username);
		user.setUserPasswd(password);
		if(userService.checkLogin(user)) {
			return SUCCESS;
		}else {
			return INPUT;
		}
		
	}
}
