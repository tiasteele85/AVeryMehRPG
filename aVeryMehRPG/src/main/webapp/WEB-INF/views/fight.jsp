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

        <!--audio autoplay>
		<src="http://ccmixter.org/content/speck/speck_-_Sirius_Crystal_1.mp3">
	</audio-->
        <div id="jumbotron">

			<br>
            <h1 class="display-3" style="font-family: 'Abril Fatface', cursive">Fight!</h1>
            <br>
            <br>

            <p id="font3">To automatically roll the dice, slam on that punch, kick or weapon button. 
            <br>This will determine how much damage is inflicted to your enemy! 
            <br>Watch out for your enemy's counter attack!!
            <br><strong>Punch:</strong> 100% effective but lower power.
            <br><strong>Kick:</strong> 60% effective but more powerful than a punch.
            <br><strong>Special:</strong> Random Die roll based on stats of your random weapon, however not as dependable as a punch</p>
        </div>

        <div id="fight-page container">
            <div class="row">
                <div class="col p-background">
                <h3 class="display-3"><strong>${player.name }</strong></h3><br><br>
                <p style="text-align:center" class="display-7">Player</p>
                    <img class="sword" src="img/char-${player.name }.png" width=50%;></img>
                    <form class="play">
                        
					
                        <p>Move: ${ punch }${ kick }${ weapon }</p>
                        <p>Your roll: ${ pDice }</p>
                        <p>Health: ${ player.health.health }</p>
                    </form>
                </div>

                <div class="col button-style">

                    <form action="/takeDamage">
                        <div class="row button-row">
                            <div class="col">
                                <input class="punchKickButtons btn-primary " type="submit" name="punch" value="punch">
                            </div>
                        </div>
                        <div class="row button-row">
                            <div class="col">
                                <input class="punchKickButtons btn-primary" type="submit" name="kick" value="kick">
                            </div>
                        </div>
                        <div class="row button-row">
                            <div class="col">
                                <input class="punchKickButtons btn-primary" type="submit" name="weapon" value="${ player.weapon.name }">
                            </div>
                        </div>
                    </form>
                </div>

                <div class="col">
                <h3 class="display-3"><strong>${enemy.name }</strong></h3><br><br>
                <p style="text-align:center" class="display-7">Enemy</p>
                    <img class="heart" src="img/char-${enemy.name}.png" width=50%;></img>
                    <form class="health">
                        
						
					
                        <p>Move: ${ eResponse }</p>
                        <p>${enemy.name} roll:${ eDice }</p>
                        <p>Health: ${ enemy.health.health }</p>
                    </form>
                </div>
            </div>

        </div>
        <form></form>
    </body>

    </html>