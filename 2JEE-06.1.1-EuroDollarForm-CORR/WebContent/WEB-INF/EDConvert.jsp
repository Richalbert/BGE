<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" href="EDconvert.css">
</head>
<body>
	<h2>Euro/Dollar Conversion</h2>
	
 	<p class="error">${error}<p>
 	<p class="success">${convert.result}</p> 
	<p>
	<form method="post" action="EDConvertController" class="standard-form">
		<fieldset>
			<legend>Fill form please: </legend>
			<label for="amount"> Amount <span class="mandatory">*</span></label> 
			<input type="number" id="amount" name="amount"  min="1" max="1000"
			value="${convert.amount}"/> <br />

			<input type="radio" id="euro" name="eToD" value="0" checked> 
			<label for="euro">Euro To Dollar</label><br /> 
			<input type="radio" id="dollar" name="eToD" value="1">
			<label for="dollar">Dollar To Euro</label><br /> 
			
			<input type="submit" value="Ok" class="noLabel" /> <br />
		</fieldset>

	</form>
	</p>
	<a href="index.html">Back to home</a>
</body>
</html>