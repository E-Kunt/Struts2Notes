package com.action;

import com.opensymphony.xwork2.ActionSupport;


public class Action extends ActionSupport {
	private String user;
	
	@Override
	public String execute() throws Exception {
		System.out.println("a user has login !");
		return SUCCESS;
	}
	
	public String input() throws Exception {
		return INPUT;
	}


	public String getUser() {
		return user;
	}



	public void setUser(String user) {
		this.user = user;
	}
}
