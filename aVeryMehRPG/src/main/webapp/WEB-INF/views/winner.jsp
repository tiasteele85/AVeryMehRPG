<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   <head>
      <link rel="stylesheet" type="text/css" href="bootstrap.css">
      <link
         href="https://fonts.googleapis.com/css?family=Barriecito&display=swap"
         rel="stylesheet">
      <meta charset="ISO-8859-1">
      <title>End of Game</title>
   </head>
   <body>
      <br>
      <br>
      <br>
      <center>
         <div class="card mb-3">
            <h3 class="card-header">Congratulations Hero!</h3>
            <div class="card-body">
               <h5 class="card-title">${ character.name }</h5>
               <h6 class="card-subtitle text-muted">Winner</h6>
            </div>
            <img style="height: 200px; width: 20%; display: block;" src="/img/apple-test.png" alt="Card image">
            <div class="card-body">
               <p class="card-text">In the story you chose to ${ character.description }</p>
            </div>
            <ul class="list-group list-group-flush">
               <li class="list-group-item">Your Health point status is:</li>
               <li class="list-group-item">Number of Punches: ${ character.punchCount }</li>
               <li class="list-group-item">Number of Kicks: ${ character.kickCount }</li>
            </ul>
            <div class="card-body">
               <a href="/leaderBoard" class="card-link">Check out how you compare to Leader Board</a>
               <a href="/" class="card-link">Play Again</a>
            </div>
         </div>
      </center>
   </body>
</html>