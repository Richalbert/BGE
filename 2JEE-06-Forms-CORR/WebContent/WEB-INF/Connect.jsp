<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connection</title>
<link rel="stylesheet" href="register.css">
</head>
<body>
<h2>Connection</h2>
<p>
     <%-- Vérification de la présence d'un objet utilisateur en session --%>
 <c:if test="${!empty sessionScope && !empty sessionScope.userSession}">
     <%-- Si l'utilisateur existe en session, alors on affiche son adresse email. --%>
		Your are connected as: ${sessionScope.userSession.name}</p>
 </c:if>
 </p>
 <a href="index.html">Back to home</a>
</body>
</html>