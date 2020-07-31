<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Private Page</title>
<link rel="stylesheet" href="resources/register1.css">
</head>
<body>
<h2>Private Page </h2>
<p>
     <!-- Si l'utilisateur existe en session, alors on affiche son adresse email. -->
<c:if test="${!empty sessionScope && !empty sessionScope.userSession}">
		<p>As your are connected as: ${sessionScope.userSession.name}
		you can see this content:</p>
		<p>THIS CONTENT is PRIVATE!!!!</p>
 </c:if>
<c:if test="${empty sessionScope}">
		<p>Sorry, you cannot see anything!!!</p>
 </c:if>
 </p>
 <a href="index.html">Back to home</a>
</body>
</html>