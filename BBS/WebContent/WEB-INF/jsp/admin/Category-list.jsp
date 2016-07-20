<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>板块列表</title>

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
	板块列表
	<hr>
	<table border="5">
		<tr>
			<th>编号</th>
			<th>板块名称</th>
			<th>板块简介</th>
			<th>操作</th>
		</tr>
		<s:iterator var="category" value="categorylist">
			<tr>
				<td><s:property value="#category.id" /></td>
				<td><s:property value="#category.name" /></td>
				<td><s:property value="#category.description" /></td>
				<td><a
					href="admin/Category-updateInput?categoryId=<s:property value="#category.id"/>">更新</a>|<a
					href="admin/Category-delete?categoryId=<s:property value="#category.id"/>">删除</a></td>
			</tr>
		</s:iterator>
	</table>
	<br />
	<a href="admin/Category-addInput">添加Category</a>
</body>
</html>
