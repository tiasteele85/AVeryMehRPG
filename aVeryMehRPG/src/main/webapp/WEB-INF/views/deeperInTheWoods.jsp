<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
   <head>
      <link rel="stylesheet" type="text/css" href="bootstrap.css">
      <link rel="stylesheet" type="text/css" href="newstyle.css">
      <link href="https://fonts.googleapis.com/css?family=Abril+Fatface|Anton|Lexend+Zetta&display=swap" rel="stylesheet">
      <title>Home Page</title>
      <meta charset="UTF-8">
      <title>DEEPER WE GO</title>
   </head>
   <body>
      <audio autoplay><source src="http://ccmixter.org/content/speck/speck_-_More_Unsettled_Autumn_Snowfall_1.mp3">
         </audio>
      <br>
      <br>
      <h1 class="display-3" style="font-family: 'Abril Fatface', cursive">Deeper we go. . .</h1>
      <div class="container" style="font1">
         <div class="row">
            <div class="col-6">
               <label id="font2">
                  <p>As you head further into the woods you walk past a tree and find a handaxe buried in its stump. You pick up the handaxe and make it your special weapon. 
                     As you continue on you're journey your confronted by a giant spider and realize that peace may not be in his nature.
                     The spider looks at you and exclaims “Hey bro, quick question… where are your shoes?"
                  </p>
                  <br>
                  <p>Do you:
                     <br>
                     <br>
                     1.Respond with a snarky comment “Wouldn’t you like to know Spider-boy?"
                     <br>
                     2.Take off your sock and chuck it at the Spider to try and scare if off
                  </p>
                  <a href="/snarky">
                  <button type="button" class="btn btn-primary btn-lg">Snarky comment</button>
                  </a>
                  <a href="/sock">
                  <button type="submit" class="btn btn-primary btn-lg">Throw my sock</button>
                  </a>
               </label>
            </div>
            <div class="col-5">
               <label>
               <img border="5px" src="forest.jpg" alt = "bar" width="500" height="350"></img>
               </label>
            </div>
         </div>
      </div>
      <br>
      <br>
   </body>
</html>