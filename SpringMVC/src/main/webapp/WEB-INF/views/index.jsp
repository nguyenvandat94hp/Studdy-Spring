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
	<h1>Spring MVC Hello World!</h1>
	<a href="hello">hello</a>
	<h3>List Data</h3>
	<c:forEach var="listNhanVien" items="${listNhanVien}">
		<tr>
			<td><c:out value="${listNhanVien.getName()}" /></td>
			<td><c:out value="${listNhanVien.getId()}" /></td>
		</tr>
		<br>
	</c:forEach>
</body>
</html>