<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>文件上传</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
</head>

<body>
	<form action="FileUpload!upload" enctype="multipart/form-data"
		method="post">
		文件:<input type="file" name="image"><br /> 文件名:<input
			type="text" name="imageFileName"><br /> <input type="submit"
			value="上传" />
	</form>
	<br />
	<strong> <FONT color="red"> <s:fielderror />
	</FONT>
	</strong>
</body>
</html>