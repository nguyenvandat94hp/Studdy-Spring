<%@ page import="java.util.List"%>
<%@ page import="vn.com.spring.entity.NhanVien"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
	<h1>Spring MVC Index World!</h1>
	<form action="hello" method="POST">
		<p>UserName <input type="text" name="userName">
		<input type="submit" value="SUBMIT">
	</form>
</body>
</html>