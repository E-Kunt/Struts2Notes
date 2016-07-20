<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login success!</title>
</head>
<body>

继承RequestAware,SessionAware,ApplicationAware接口，获取Map型的WEB元素 <br/>
 （依赖于IOC[控制反转]、DI[依赖注入],实际开发就是用这一种方法！记住他！）<br/><br/>

<!-- 此处使用s:property或sriptlet都可以精确地获取属性值-->
request : <s:property value="#request.rr"/> <br/>
session : <s:property value="#session.ss"/> <br/>
application : <s:property value="#application.aa"/> <br/>

<!-- attr将从所有可以设置Attribute的地方搜索值，故慎用 -->
<s:property value="#attr.rr"/> -- <s:property value="#attr.ss"/> -- <s:property value="#attr.aa"/>

<s:debug/>

</body>
</html>