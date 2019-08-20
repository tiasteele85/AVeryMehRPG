<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fight Fight Fight</title>
</head>

<link
	href="https://fonts.googleapis.com/css?family=Barriecito&display=swap"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="style.css">
<body>

	<audio autoplay>
		<source src="">
	</audio>
	<div><a href="/">Home</a></div>
	
	<div class="wrapper">
		<div class="inner" style="float: left">
			<p></p>
			<p>hello hi</p>
		</div>
		<div style="float: left">
			<div>
				<h1 align="center">Fight Story</h1>
				<p>${ player }</p>
				<p>${ enemy }</p>

				<p></p>
				<form action="/takeDamage">
					<input type="submit" name="punch" value="punch"> <input
						type="submit" name="kick" value="kick">
				</form>
			</div>
		</div>
	</div>
	
	<div></div>

	
		
	



</body>
</html>