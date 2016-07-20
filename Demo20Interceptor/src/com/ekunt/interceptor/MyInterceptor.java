package com.ekunt.interceptor;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		long start = System.currentTimeMillis();
		String r = invocation.invoke();
		long end = System.currentTimeMillis();
		System.out.println("it cost : " + (end - start) + " milliseconds");
		System.out.println(r);
		return null;
	}


}
