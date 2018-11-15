<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
  <h1>Spring MVC Hello World!</h1>
  <a href="hello">hello</a>
  <h3>${tendangnhap}</h3>
  
  <%
  	int age = (Integer) request.getAttribute("ages");
  	int temp = 3;
  	int sum = age + temp;
  %>
  <%= sum %>
</body>
</html>