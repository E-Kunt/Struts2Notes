package com.ekunt.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 方式2：继承RequestAware,SessionAware,ApplicationAware接口，获取Map型的WEB元素 
 * （依赖于IOC[控制反转]、DI[依赖注入],实际开发就是用这一种方法！记住他！）
 */
public class Action2 extends ActionSupport implements RequestAware, SessionAware, ApplicationAware {

	private Map<String, Object> request;
	private Map<String, Object> session;
	private Map<String, Object> application;
	

	@Override
	public String execute() throws Exception {
		request.put("rr", "rr");
		session.put("ss", "ss");
		application.put("aa", "aa");
		return SUCCESS;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	
}
