package com.ekunt.action;

import com.opensymphony.xwork2.ActionSupport;

public class Action extends ActionSupport {
	private String name;
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
