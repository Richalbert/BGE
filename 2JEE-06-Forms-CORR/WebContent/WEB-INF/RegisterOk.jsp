<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" href="register.css">
</head>
<body>
<h2>Registering is OK for you: </h2>
<jsp:useBean id="user" 
	class="com.phdareys.register.bean.Register" 
	scope="request"/>
<p>
Firstname: ${user.firstname} <br/>
Name: ${user.name} <br/>
mdp: ${user.password} <br/>
 </p>
 <a href="index.html">Back to home</a>
</body>
</html>