package com.ekunt.action;

import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 方式4：继承ServletRequestAware，获取真实类型的WEB元素 （依赖于IOC、DI,不常用）
 */
public class Action4 extends ActionSupport implements ServletRequestAware {

	private HttpServletRequest request;
	private HttpSession session;
	private ServletContext application;
	
	@Override
	public String execute() throws Exception {
		request.setAttribute("rr", "rr");
		session.setAttribute("ss", "ss");
		application.setAttribute("aa", "aa");
		return SUCCESS;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		this.session = request.getSession();
		this.application = request.getServletContext();
	}
}
