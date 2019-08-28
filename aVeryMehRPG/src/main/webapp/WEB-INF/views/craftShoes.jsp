<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
   <head>
      <link rel="stylesheet" type="text/css" href="bootstrap.css">
      <link rel="stylesheet" type="text/css" href="newstyle.css">
			<link href="https://fonts.googleapis.com/css?family=Abril+Fatface|Anton|Lexend+Zetta&display=swap" rel="stylesheet">            <title>Home Page</title>
      <meta charset="UTF-8">
      <title>Craft Shoes</title>
   </head>
   <body>
      <!--audio autoplay>
         <source src="http://ccmixter.org/content/speck/speck_-_More_Unsettled_Autumn_Snowfall_1.mp3">
         </audio-->
      
      <div class="container" style="font1">
      <h1 class="display-3" style="font-family: 'Abril Fatface', cursive">Prove your father wrong. . .</h1>
      <br>
      <br>
      <br>
      <br>
         <div class="row">
            <div class="col-6">
               <label id="font2">
                  <p> You try to create a make-shift pair of shoes, but fail and feel your father looking down on you disappointed, since he was a cobbler and tried to teach you to craft shoes several times.
                     You decide to head back towards the bar to see if you can find the mysterious man.
                  <p> Do you:
                     <br>1. Craft a makeshift pair of shoes out of leaves and walk back towards civilization
                     <br>2. Go deeper into the woods and accept the fact that no one will believe a stranger took your shoes, so this is now your home.
                  </p>
               </label>
               <br>
               <a href="/barFightStory">
               <button type="button" class="btn btn-primary btn-lg">Walk back in sorrow</button>
               </a>
            </div>
            <div class="col-5">
               <label>
               <img border="5px" src="forest.jpg" alt = "bar" width="500" height="350"></img>
               <br>
               
               </label>
            </div>
         </div>
      </div>
   </body>
</html>