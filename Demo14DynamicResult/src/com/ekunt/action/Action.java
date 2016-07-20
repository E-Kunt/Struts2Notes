package com.ekunt.action;

import com.opensymphony.xwork2.ActionSupport;

public class Action extends ActionSupport {
	private String type;
	private String r;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getR() {
		return r;
	}
	public void setR(String r) {
		this.r = r;
	}
	
	@Override
	public String execute() throws Exception {
		if(type!=null && type.equals("1")) {
			r="hello1.jsp";
		}else if(type!=null && type.equals("2")) {
			r="hello2.jsp";
		}else {
			r="index.jsp";
		}
		return SUCCESS;
	}
}
