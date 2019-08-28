<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <link rel="stylesheet" type="text/css" href="bootstrap.css">
            <link rel="stylesheet" type="text/css" href="newstyle.css">
            <link href="https://fonts.googleapis.com/css?family=Abril+Fatface|Anton|Lexend+Zetta&display=swap" rel="stylesheet">
      <meta charset="UTF-8">
      <title>BarFight</title>
   </head>
   <body>
      <br>
      <br>
      <h1 class="display-3" style="font-family: 'Abril Fatface', cursive">Let's get those shoes back, Champ!</h1>
      <br>
        <div class="container" style="font1">
                <div class="row">
                    <div class="col-6">
                        <label id="font2">
                            <p>You walk all the way back to the city and eventually make it to the bar. As you're passing by the entrance, you ignore the “shoes are required to enter” sign and push your way in.
        					 Upon entering, you see the mysterious man still sitting at the bar. He's wearing your shoes and buying rounds of drinks for everyone around him with your rubies!
         					<br><br>
                            Do you:<br>
        					 1. Walk up to the stranger and try to fight him without saying a word<br>
        					 2. Yell at him for being a big meanie
      						</p>
                            <a href="/fight">
                                <button type="button" class="btn btn-primary btn-lg">Fight</button>
                            </a>
                            <a href="/meanie">
                                <button type="submit" class="btn btn-primary btn-lg">Meanie</button>
                            </a>
                        </label>
                    </div>
                    <div class="col-5">
                        <label>
                            <img border="5px" src="bar.jpg" alt = "bar" width="500" height="350"></img>
                        </label>
                    </div>
                   
                </div>
            </div>
            </body>
</html>