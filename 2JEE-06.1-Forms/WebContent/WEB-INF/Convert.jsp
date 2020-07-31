<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Convertion</title>
		<link rel='stylesheet' type='text/css' href='styles.css' />
	</head>
	<body>
		<h2>Convertion</h2>

		
		
		<form method="post" action="ConvertController" class="standard-form">
		
			<fieldset>
			
				<legend>Convertion Euro / Dollard </legend>
				
				<div>
					  <input type="radio" id="dollar" name="radioBoutton" value="dollar" checked>
					  <label for="dollar">(€) Euro  -->  ($) Dollar </label> <br />
					  
					  <input type="radio" id="euro" name="radioBoutton" value="euro">
					  <label for="dollar"> ($) Dollar --> (€) Euro </label> <br />
					  
			    </div>
				
				<div>
					<label for="name">Montant </label>
	           		<input type="number" id="montant" name="montant" value="${convert.inAmount}" min="1" max="1000" >
				</div>
				
				<div>
					<input type="submit" value="Ok" class="noLabel" />
				</div>
                


			
			</fieldset>
			
			<p>
			${error}
			</p>
			
			
		
		</form>
		
	</body>
</html>