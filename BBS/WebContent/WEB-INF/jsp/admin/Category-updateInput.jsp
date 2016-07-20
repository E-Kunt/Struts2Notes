<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>更新版块</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <form action="admin/Category-update" method="post">
  	<input type="hidden" name="category.id" value="<s:property value="category.id"/>">
  	版块名称: <input type="text" name="category.name" value="<s:property value="category.name"/>"/> <br/>
  	版块简介:<br/><textarea name="category.description"><s:property value="category.description"/></textarea> <br/>
  	<input type="submit" value="确认更新" /> 
  </form>
  </body>
</html>
