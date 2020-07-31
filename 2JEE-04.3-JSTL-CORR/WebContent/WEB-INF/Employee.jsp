<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>My Team</title>
</head>
<body>

	<h1>My Team</h1>
	<img src="image/employee.jpg" />
	<table>
		<tr>
			<th>Name</th>
			<th>FirstName</th>
			<th>Age</th>
		</tr>
		<c:forEach items="${listeEmp}" var="current" varStatus="counter">
			<c:set var="rowStyle" scope="page" value="even" />
			<c:if test="${counter.count % 2 == 1}">
				<c:set var="rowStyle" scope="page" value="odd" />
			</c:if>
			<tr class="${rowStyle}" style="borderCollapse: 1px solid black;">
				<td><c:out value="${current.nom}" /></td>
				<td><c:out value="${current.prenom}" /></td>
				<td><c:out value="${current.age}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>