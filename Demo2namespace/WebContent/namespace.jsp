<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>namespace</title>
</head>
<body>
namespace属性决定Action的访问路径。可以不写，则为默认值:""，可以接收所有路径的Action,如/index.jsp或/xxx/yifhsdoa/fdsafds/index.jsp。<br/>
在对应路径找不到package或Action时，就会访问namespace为""的Package里面的Action(若存在此Action)。<br/>
namespace可以为"/","/xxx","/xxx/yyy"，对应的Action访问路径为："/index.jsp","/xxx/index.jsp","/xxx/yyyy/index.jsp"<br/>
namespace最好使用模块名称来命名。
</body>
</html>