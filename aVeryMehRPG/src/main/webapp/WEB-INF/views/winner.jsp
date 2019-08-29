<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   <head>
      <link rel="stylesheet" type="text/css" href="bootstrap.css">
            <link rel="stylesheet" type="text/css" href="newstyle.css">
            <link href="https://fonts.googleapis.com/css?family=Abril+Fatface|Anton|Lexend+Zetta&display=swap" rel="stylesheet">
      <meta charset="ISO-8859-1">
      <title>End of Game</title>
   </head>
   <body>
   <audio autoplay><source src="http://ccmixter.org/content/texasradiofish/texasradiofish_-_Stellar_Heart_Beat.mp3"></audio>
      <br>
      <br>
      <br>
      <br> <h1 class="display-3" style="font-family: 'Abril Fatface', cursive">Congratulations ${ character.name }!</h1>
         <h3 class="display-7">Winner</h3>
      <div class="container" style="font1">
         <div class="row">
         	<div class="col-5">
               <label>
               <img src="/img/char-${ character.name }.png" style="width:50%"></img>
               </label>
            </div>
            <div class="col-6" id="font1">
               <label>
                  <p>In the story you chose to ${ character.description } vanquish the enemy!</p>
                  <p>Your Health point status is: ${ character.health }</p>
                  <p>Number of Punches: ${ character.punchCount }</p>
                  <p>Number of Kicks: ${ character.kickCount }</p>
                  <br>
                  <a href="/leaderBoard">
                  <button type="button" class="btn btn-primary btn-lg">Leader board</button>
                  </a>
                  <a href="/">
                  <button type="submit" class="btn btn-primary btn-lg">Play again</button>
                  </a>
               </label>
            </div>
           
         </div>
      </div>
      <br>
      <br>
      </body>
</html>