package com.ekunt.action;

import com.opensymphony.xwork2.ActionSupport;

public class ValidateAction extends ActionSupport {
	private String name;

	@Override
	public String execute() throws Exception {
		if(name != null ) {
			if(name.equals("root"))
				return SUCCESS;
			if(name.equals("admin"))
				return "ok";
		}
		return ERROR;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
