<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie</title>
<link rel="stylesheet" href="register.css">
</head>
<body>
<h2>Check a Cookie </h2>

<p>
<c:if test="${ ! empty myCookie}">
	Mon cookie: ${ myCookie }
</c:if> 
 </p>
 <a href="index.html">Back to home</a>
</body>
</html>