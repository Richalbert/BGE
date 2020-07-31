<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shape Form</title>
<link rel="stylesheet" href="shape.css">
</head>
<body>
	<h2>Draw of Geom. Shapes using SVG api (with some random parameters)</h2>
	<p>
	<form method="post" action="ShapeController">
		<fieldset>
			<legend>Choose Shapes to Draw (0..10 for each case)</legend>
			<label for="linesNb"> Lines Nb </label> 
			<input type="number" id="linesNb" name="linesNb" min="0" max="10" value="0"><br /> 
			<label for="rectsNb"> Rectangles Nb </label> 
			<input type="number" id="rectsNb" name="rectsNb" min="0" max="10" value="0"><br /> 
			<label for="disksNb"> Disks Nb </label> 
			<input type="number" id="disksNb" name="disksNb" min="0" max="10" value="0"><br /> 
			 
			<input type="submit" value="Ok" class="noLabel" /> <br />
		</fieldset>

	</form>
	</p>
	<p>	<a href="">Back</a><p>

</body>
</html>