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
<link rel="stylesheet" type="text/css" href="bootstrap.css">
<body>

	<audio autoplay>
		<source
			src="http://ccmixter.org/content/speck/speck_-_Sirius_Crystal_1.mp3">
	</audio>
	<center>
		<h1 id="fightheader">Fight!</h1>
	</center>

	<div class="fight-page">
		<div class="column left2">
			<img class="sword" src="sword.png"></img>
			<form class="play">
				<h3>Move:</h3>
				<p>${player.name}(player):${ punch }${ kick }${ weapon }</p>
				<p id="eResponse">${enemy.name}(enemy):${ eResponse }</p>
			</form>
		</div>
		<div class="column middle2">
			<div class="dice">
				<h3>Player Dice: ${ pDice }</h3>
				<h3>Enemy Dice: ${ eDice }</h3>
			</div>
		</div>
		<div class="column right2">
			<img class="heart" src="heartHealth.png"></img>
			<form class="health ">
				<h3>Health:</h3>
				<p>${player.name}(player):${ player.health.health }</p>
				<p>${enemy.name}(enemy):${ enemy.health.health }</p>
			</form>
		</div>
	</div>
	<center>
		<form action="/takeDamage">
			<input class="punchKickButtons btn-primary" type="submit" name="punch" value="punch">
			<input class="punchKickButtons btn-primary" type="submit" name="kick" value="kick">
			<input class="punchKickButtons btn-primary" type="submit" name="weapon"
				value="${ player.weapon.name }">
		</form>
	</center>




	<form></form>

	<form></form>







</body>
>>>>>>> Stashed changes
</html>