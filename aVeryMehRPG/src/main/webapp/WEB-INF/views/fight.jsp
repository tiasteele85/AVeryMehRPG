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
      <link href="https://fonts.googleapis.com/css?family=Abril+Fatface|Anton|Lexend+Zetta&display=swap" rel="stylesheet">

<body>

	<audio autoplay>
		<source
			src="http://ccmixter.org/content/speck/speck_-_Sirius_Crystal_1.mp3">
	</audio>
	<div id="fight-page margin">

		<h1 class="display-4"  style="font-family: 'Abril Fatface', cursive">Fight!</h1>
<br>
<p class="lead">To automatically roll the dice, slam on that punch, kick or
			weapon button. This will determine how much damage is inflicted to
			your enemy! Watch out for your enemy's counter attack!!<br>
			Punch: 100% effective but lower power<br>
			Kick: 60% effective but more powerful than a punch<br>
			Special: Random Die roll based on stats of your random weapon,
			however not as dependable as a punch</p>
	</div>

	<div id="fight-page" class="container">
		<div class="row">
			<div class="col p-background">
<h3>
						<strong>${player.name }</strong>
					</h3>
				<div class="progress bg-primary p-bar">
					<div class="progress-bar bg-success" role="progressbar"
						style="width: ${player.health.health}%;" aria-valuenow="100"
						aria-valuemin="0" aria-valuemax="100"></div>

				</div>

				<img class="sword" src="img/char-${player.name }.png" width=30%; margin-top:35%;></img>
				<form class="play">
					
					<br>
					<br>
					<p id="font1">Move: ${ punch }${ kick }${ weapon }</p>
					<p id="font1">Your roll: ${ pDice }</p>
					<p id="font1">Health: ${ player.health.health }</p>
				</form>
			</div>

			<div class="col button-style">

				<form action="/takeDamage">
					<div class="row button-row">
						<div class="col">
							<input class="btn btn-primary btn-lg" type="submit"
								name="Punch" value="Punch">
						</div>
					</div>
					<div class="row button-row">
						<div class="col">
							<input class="btn btn-primary btn-lg" type="submit"
								name="Kick" value="Kick">
						</div>
					</div>
					<div class="row button-row">
						<div class="col">
							<input class="btn btn-primary btn-lg" type="submit"
								name="weapon" value="${ player.weapon.name }">
						</div>
					</div>
				</form>
			</div>

			<div class="col">
			<h3>
						<strong>${enemy.name }</strong>
					</h3>
				<div class="progress bg-primary p-bar ">
				
					<div class="progress-bar bg-success" role="progressbar"
						style="width: ${enemy.health.health}%;" aria-valuenow="100"
						aria-valuemin="0" aria-valuemax="100"></div>
						
				</div>

				<img class="heart" src="img/char-${enemy.name }.png" width=30%;></img>
				<form class="health ">
					<br><br>
					<p id="font1">Move: ${ eResponse }</p>
					<p id="font1">${enemy.name} roll:${ eDice }</p>
					<p id="font1">Health: ${ enemy.health.health }</p>
				</form>
			</div>
		</div>


	</div>





	<form></form>

	<form></form>
</body>

</html>