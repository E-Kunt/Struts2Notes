package com.ekunt.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String add() {
		if(name == null || !name.equals("root")) {
			this.addFieldError("name", "name is not right!");
			this.addFieldError("name", "name is too long!");
			this.addActionError("this is action Error!");
			return ERROR;
		}
		return SUCCESS;
	}
}
