<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fight Fight Fight</title>
</head>
<link rel="stylesheet" type="text/css" href="bootstrap.css">
<link rel="stylesheet" type="text/css" href="newstyle.css">
<link
	href="https://fonts.googleapis.com/css?family=Bangers|Barriecito|Luckiest+Guy|Press+Start+2P|Sacramento&display=swap"
	rel="stylesheet">
<body>

	<audio autoplay>
		<source
			src="http://ccmixter.org/content/speck/speck_-_Sirius_Crystal_1.mp3">
	</audio>
	<div id="fight-page margin">
	
		<h1 id="fightheader">Fight!</h1>
	
	
		<p>To automatically roll the dice, slam on that punch, kick or
			weapon button. This will determine how much damage is inflicted to
			your enemy! Watch out for your enemy's counter attack!!</p>
		
		<p>Punch: 100% effective but lower power</p>
		<p>Kick: 60% effective but more powerful than a punch</p>
		<p>Special: Random Die roll based on stats of your random
			weapon, however not as dependable as a punch</p>
	</div>

	<div id="fight-page container">
		<div class="row">
			<div class="col p-background">
				<img class="sword" src="img/char-${player.name }.png" width=50%;></img>
				<form class="play">
					<h3>
						<strong>${player.name }</strong>
					</h3>
					<p>Move: ${ punch }${ kick }${ weapon }</p>
					<p>Your roll: ${ pDice }</p>
					<p>Health: ${ player.health.health }</p>
				</form>
			</div>

			<div class="col button-style">

				<form action="/takeDamage">
					<div class="row button-row">
						<div class="col">
							<input class="punchKickButtons btn-primary " type="submit"
								name="punch" value="punch">
						</div>
					</div>
					<div class="row button-row">
						<div class="col">
							<input class="punchKickButtons btn-primary" type="submit"
								name="kick" value="kick">
						</div>
					</div>
					<div class="row button-row">
						<div class="col">
							<input class="punchKickButtons btn-primary" type="submit"
								name="weapon" value="${ player.weapon.name }">
						</div>
					</div>
				</form>
			</div>

			<div class="col">
				<img class="heart" src="img/char-${enemy.name }.png" width=50%;></img>
				<form class="health ">
					<h3>
						<strong>${enemy.name }</strong>
					</h3>
					<p>Move: ${ eResponse }</p>
					<p>${enemy.name}roll:${ eDice }</p>
					<p>Health: ${ enemy.health.health }</p>
				</form>
			</div>
		</div>


	</div>





	<form></form>

	<form></form>
</body>

</html>