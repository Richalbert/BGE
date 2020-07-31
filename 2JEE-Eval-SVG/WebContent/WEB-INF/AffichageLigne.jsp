<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Affichage des lignes</title>
	</head>
	<body>
		<h1>Affichages des lignes</h1>
		
		nbLigne = ${nbLigne}<br>
		
		
		
		
	<%-- 	<p>x1=${lignes.ligne}</p> --%>
		
		<svg height="500" width="500" style="background-color: grey">
		 
  			<line x1="${ligne1.x1}" y1="${ligne1.y1}" x2="${ligne1.x2 }" y2="${ligne1.y2}" style="stroke:rgb(255,0,0);stroke-width:2" />
  			<line x1="${ligne2.x1}" y1="${ligne2.y1}" x2="${ligne2.x2 }" y2="${ligne2.y2}" style="stroke:rgb(255,0,0);stroke-width:2" />
  			<line x1="${ligne3.x1}" y1="${ligne3.y1}" x2="${ligne3.x2 }" y2="${ligne3.y2}" style="stroke:rgb(255,0,0);stroke-width:2" />
  			<line x1="${ligne4.x1}" y1="${ligne4.y1}" x2="${ligne4.x2 }" y2="${ligne4.y2}" style="stroke:rgb(255,0,0);stroke-width:2" />
  			<line x1="${ligne5.x1}" y1="${ligne5.y1}" x2="${ligne5.x2 }" y2="${ligne5.y2}" style="stroke:rgb(255,0,0);stroke-width:2" />
  			<line x1="${ligne6.x1}" y1="${ligne6.y1}" x2="${ligne6.x2 }" y2="${ligne6.y2}" style="stroke:rgb(255,0,0);stroke-width:2" />
  			<line x1="${ligne7.x1}" y1="${ligne7.y1}" x2="${ligne7.x2 }" y2="${ligne7.y2}" style="stroke:rgb(255,0,0);stroke-width:2" />
  			<line x1="${ligne8.x1}" y1="${lign68.y1}" x2="${ligne8.x2 }" y2="${ligne8.y2}" style="stroke:rgb(255,0,0);stroke-width:2" />
  			<line x1="${ligne9.x1}" y1="${ligne9.y1}" x2="${ligne9.x2 }" y2="${ligne9.y2}" style="stroke:rgb(255,0,0);stroke-width:2" />
  			<line x1="${ligne10.x1}" y1="${ligne10.y1}" x2="${ligne10.x2 }" y2="${ligne10.y2}" style="stroke:rgb(255,0,0);stroke-width:2" />
  			<!-- <line x1="0" y1="0" x2="200" y2="200" style="stroke:rgb(255,0,0);stroke-width:2" />
 			<line x1="110" y1="0" x2="20" y2="200" style="stroke:rgb(255,0,0);stroke-width:5" />
  		
  			< -->line x1="110" y1="0" x2="20" y2="200" style="stroke:rgb(255,0,0);stroke-width:5" /> 
  			
  			
		 </svg> 
		
		<p><a href="index.html">Retour</a></p>
		
	</body>
</html>