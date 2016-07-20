package com.ekunt.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String add(){
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		return SUCCESS;
	}
}
