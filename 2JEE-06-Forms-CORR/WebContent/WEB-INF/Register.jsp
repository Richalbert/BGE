<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" href="register.css">
<script language="JavaScript" type="text/javascript" src="jsfile.js"></SCRIPT>
</head>
<body>
<h2>Register</h2>
<p>
	       <form method="post" action="RegisterController" class="standard-form">
            <fieldset>
                <legend>Please register on my WebSite: </legend>
                <label for="name">Name <span class="mandatory">*</span></label>
                <input type="text" id="name" name="name" value="<c:out value="${user.name}"/>" size="20" maxlength="30" />
                 <span class="error">${errors['name']}</span>
                 <br />
                <label for="firstname">Firstname <span class="mandatory">*</span></label>
                <input type="text" id="firstname" name="firstname" value="<c:out value="${user.firstname}"/>" size="20" maxlength="30" />
                 <span class="error">${errors['firstname']}</span>
                 <br />
                <label for="password">Password <span class="mandatory">*</span></label>
                <input type="password" id="password" name="password" value="" size="20" maxlength="20" />
             	<span class="error">${errors['password']}</span> 
                 <br />
                <label for="password">Password Again <span class="mandatory">*</span></label>
                <input type="password" id="password2" name="password2" value="" size="20" maxlength="20" />
             	<span class="error">${errors['password2']}</span> 
                 <br />
                <input type="submit" value="Ok" class="noLabel" />
                <br />
            </fieldset>

        </form>
</p>
<a href="index.html">Back to home</a>
</body>
</html>