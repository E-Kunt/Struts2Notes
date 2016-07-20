<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello Struts2 !</title>
</head>
<body>
<s:text name="com.ekunt.hello">
	<s:param>E-Kunt</s:param>
</s:text>
<br/>
<s:property value="getText('com.ekunt.level')"/>

<hr/>
properties文件命名规则：<br/>
action级别的：以action的类名开头<br/>
package级别的：以"package"开头<br/>
application级别的：开头字符串无限制。需要配置struts.xml，&lt;constant name="struts.custom.i18n.resources" value="开头字符串"/&gt;<br/>
<hr/>
properties文件优先规则：
action 》 package 》 application
</body>
</html>