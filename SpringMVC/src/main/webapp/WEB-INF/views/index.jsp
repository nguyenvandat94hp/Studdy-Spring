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
		<p>
			id <input type="text" name="id">
		<p>
			name <input type="text" name="name">
		<p>
			location <input type="text" name="location">
		<p>
			giamDoc <input type="text" name="giamDoc"> <input
				type="submit" value="SUBMIT">
	</form>

	<ul>
		<c:forEach items="${lists}" var="list">
			<li>${list.maNhanVien}</li>
			<li>${list.tenDangNhap}</li>
			<li>${list.diaChi}</li>
			<li>${list.matKhau}</li>
			<br>
		</c:forEach>
	</ul>
</body>
</html>