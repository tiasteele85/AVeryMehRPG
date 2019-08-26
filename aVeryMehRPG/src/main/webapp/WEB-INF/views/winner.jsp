<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   <head>
      <link rel="stylesheet" type="text/css" href="bootstrap.css">
      <meta charset="ISO-8859-1">
      <title>End of Game</title>
   </head>
   <body>
      <br>
      <br>
      <br>
      <br>
      <center>
         <div class="card text-white bg-dark mb-3">
            <h3 class="card-header">Congratulations hero!</h3>
            <div class="card-body">
               <h5 class="card-title">${ character.name }</h5>
            </div>
            <img style="height: 200px; width: 20%; display: block;" src="/img/apple-test.png" alt="Card image">
            <div class="card-body">
               <p class="card-text">In the story you chose to ${ character.description } vanquish the enemy!</p>
            </div>
            <ul class="list-group list-group-flush">
               <li class="card-text">Your Health point status is: ${ character.health }</li>
               <li class="card-text">Number of Punches: ${ character.punchCount }</li>
               <li class="card-text">Number of Kicks: ${ character.kickCount }</li>
            </ul>
            <div class="card-body">
               <a href="/leaderBoard" class="card-link">Leader Board</a>
               <a href="/" class="card-link">Play Again</a>
            </div>
         </div>
      </center>
   </body>
</html>