<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

	<head>
	
		<meta charset="UTF-8">
		<title>Shape Form</title>
		<link rel="stylesheet" href="shape.css">
		
	</head>

	<body>
	
		<h2>Draw of Geom Shapes in SVG mode:</h2>
		<svg height="${gridHeight}" width="${gridWidth}" style="background-color: grey">
			<c:forEach items="${shapes}" var="current" varStatus="counter">
				${current.svgCode}
			</c:forEach>
		</svg>
		<p>	<a href="index.html">Back</a><p>
	
	</body>
	
</html>