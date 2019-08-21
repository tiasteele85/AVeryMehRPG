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
	<div class="wrapper">
		<div class="inner" style="float: left">
			<p></p>

		</div>
		<div style="float: left">
			<div>
				<h1 align="center">Fight Story</h1>
				<p>${ punch }</p>
				<p>${ kick }</p>
				<p>${ eResponse }</p>

				<p></p>
				<form action="/takeDamage">
					<input type="submit" name="punch" value="punch"> <input
						type="submit" name="kick" value="kick">
				</form>
			</div>
		</div>
	</div>
	
	<div></div>
	

	<form>
       <p>Enemy:
       ${ enemy.health.health }</p>
    </form>
      
    
    <form>   
       <p>Player:
       ${ player.health.health }</p>
    </form>
	<p>
		<a href="/">Home</a>
	</p>



</body>
</html>