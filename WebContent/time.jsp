<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<title>开发第一个JSP网站</title>
</head>
<body>
	你好，这是我的第一个JSP程序<br>
	现在时间是：<%=new Date().toLocaleString() %>
</body>
</html>
