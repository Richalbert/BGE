<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>


<html>
	<head>
		<title><spring:message code="titre.employe" /> : ${personne}</title>
	</head>
<body>
	

	<h1>
		<spring:message code="h1.employe"
			arguments="${employe.firstName}, ${employe.lastName}" />
	</h1>

	<h2>gagne a l'annee : ${employe.yCost }</h2>




</body>
</html>