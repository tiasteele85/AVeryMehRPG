<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fight Fight Fight</title>
</head>
<link rel="stylesheet" type="text/css" href="style.css">
<link href="https://fonts.googleapis.com/css?family=Barriecito&display=swap" rel="stylesheet">
<body>

<audio autoplay>
      <source src="">
</audio>
	<div>		
			                <h1>Fight Story</h1>
							<p>${ player }</p>
							<p>${ enemy }</p>
						
			
				<p></p>
				<form action="/takeDamage">
					<input type="submit" name="punch" value="punch">
					<input type="submit" name="kick" value="kick">
				</form>
			
		
	</div>
</body>
</html>