<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User add error!</title>
</head>
<body>

<a href="${pageContext.request.contextPath }/user!add?name=root">正确页</a> <br/>

<s:debug></s:debug> <br/>

<!-- 错误显示的方式一 (不常用)-->
<s:fielderror name="name" theme="simple"></s:fielderror> <br/>

<!-- 错误显示的方式二 (常用) -->
<s:property value="errors.name[0]"/> <br/>
<s:property value="errors.name[1]"/> <br/>

<s:actionerror/>

</body>
</html>