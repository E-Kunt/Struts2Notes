<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="${pageContext.request.contextPath }/">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello Struts2 !</title>
</head>
<body>
<a href="validate?name=root">return success</a> <br/>
<a href="valid?name=admin">return ok</a> <br/>
<a href="validate?name=guest">return error</a> <br/>
<a href="valid?name=admin">return error </a> <br/>
<br/>
<br/>


&lt;struts&gt;<br/>
<b>
&nbsp;&lt;package name="base" namespace="/" extends="struts-default"&gt;<br/>
&nbsp;&nbsp;&lt;!-- 同个包的所有Action都共用这个result --&gt;<br/>
&nbsp;&nbsp;&lt;global-results&gt;<br/>
&nbsp;&nbsp;&nbsp;&lt;result name="error"&gt;error.jsp&lt;/result&gt;<br/>
&nbsp;&nbsp;&lt;/global-results&gt;<br/>
&nbsp;&lt;/package&gt;<br/>
</b>
    
&nbsp;&lt;package name="user" namespace="/" <b>extends="base"</b>&gt;<br/>
&nbsp;&nbsp;&lt;action name="validate" class="com.ekunt.action.ValidateAction"&gt;<br/>
&nbsp;&nbsp;&nbsp;&lt;result&gt;success.jsp&lt;/result&gt;<br/>
&nbsp;&nbsp;&nbsp;&lt;result name="ok"&gt;ok.jsp&lt;/result&gt;<br/>
&nbsp;&nbsp;&lt;/action&gt;<br/>
&nbsp;&nbsp;&lt;action name="valid" class="com.ekunt.action.ValidateAction"&gt;<br/>
&nbsp;&nbsp;&nbsp;&lt;result&gt;success.jsp&lt;/result&gt;<br/>
&nbsp;&nbsp;&nbsp;&lt;result name="ok"&gt;ok.jsp&lt;/result&gt;<br/>
&nbsp;&nbsp;&lt;/action&gt;<br/>
&nbsp;&lt;/package&gt;<br/>
&lt;/struts&gt;<br/>
</body>
</html>