package com.action;

import java.awt.Point;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;


public class Action extends ActionSupport {
	private List<Point> list;

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public List<Point> getList() {
		return list;
	}

	public void setList(List<Point> list) {
		this.list = list;
	}
}
