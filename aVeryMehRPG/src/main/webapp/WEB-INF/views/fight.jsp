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

	<!--<audio autoplay>-->
		<!--<source src="http://ccmixter.org/content/speck/speck_-_Sirius_Crystal_1.mp3">-->
	<!--</audio>-->
	<div class="wrapper">
		<div class="inner" style="float: left">
			<p></p>

		</div>
		<div style="float: left">
			<div>
				<h1 align="center"><font size="6">Fight Story</h1>
				
				<p>${ punch }</p>
				<p>${ kick }</p>
				<p id="eResponse">${ eResponse }</p>

				<p></p>
				<form action="/takeDamage" >
					<input id="punchKickButtons" type="submit" name="punch" value="punch"> 
					<input id="punchKickButtons" type="submit" name="kick" value="kick">
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
		<center><style="margin-top:5;"><a href="/">Home</a></center>
	</p>



</body>
</html>