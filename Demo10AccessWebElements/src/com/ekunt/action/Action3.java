package com.ekunt.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Action3 extends ActionSupport {

	private HttpServletRequest request;
	private HttpSession session;
	private ServletContext application;
	
	/**
	 * 方式3：使用ServletActionContext，获取真实类型的WEB元素 （依赖于Struts,不常用）
	 */
	public Action3() {
		request = ServletActionContext.getRequest();
		session = request.getSession();
		application = session.getServletContext();
	}
	
	@Override
	public String execute() throws Exception {
		request.setAttribute("rr", "rr");
		session.setAttribute("ss", "ss");
		application.setAttribute("aa", "aa");
		return SUCCESS;
	}
}
