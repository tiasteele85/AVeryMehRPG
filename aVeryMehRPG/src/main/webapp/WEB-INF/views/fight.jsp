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
         <source src="http://ccmixter.org/content/speck/speck_-_Sirius_Crystal_1.mp3">
      </audio>
         <h1 id="fightheader">Fight!</h1>
     
      <img id="sword" src="sword.png"></img>
      <form id="play">
         <h3>Move:</h3>
         <p>${player.name} (player): ${ punch }
            ${ kick }${ weapon }
         </p>
         <p id="eResponse">${enemy.name} (enemy): ${ eResponse }</p>
      </form>
      <img id="heart" src="heartHealth.png"></img>
      <form id="health">
         <h3>Health:</h3>
         <p>${player.name} (player):
            ${ player.health.health }
         </p>
         <p>${enemy.name} (enemy):
            ${ enemy.health.health }
         </p>
      </form>
         <form action="/takeDamage" >
            <input id="punchKickButtons" type="submit" name="punch" value="punch"> 
            <input id="punchKickButtons" type="submit" name="kick" value="kick">
            <input id="punchKickButtons" type="submit" name="weapon" value="${ player.weapon.name }">
         </form>
      
      <form>   
      </form>
      <form>
      </form>
   </body>
</html>