package com.ekunt.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	//将参数定义为Action的成员变量
	private int id;
	private String name;
	private String password;

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String add() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(password);
		return "success";
	}
}
