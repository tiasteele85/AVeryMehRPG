
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
   <head>
      <link rel="stylesheet" type="text/css" href="bootstrap.css">
      <link rel="stylesheet" type="text/css" href="newstyle.css">
      <link href="https://fonts.googleapis.com/css?family=Abril+Fatface|Anton|Lexend+Zetta&display=swap" rel="stylesheet">
      <meta charset="UTF-8">
      <title>Knighty Knight</title>
   </head>
   <body>
      <audio autoplay>
         <source src="http://ccmixter.org/content/cyba/cyba_-_new_circle.mp3">
         </audio>
         <br>
         <br>
      <h1 class= "display-3" style="font-family: 'Abril Fatface', cursive">Meet the hero?</h1>
      <div class="container" style="font1">
         <div class="row">
            <div class="col-6">
               <label id="font1">
                  <p>You walk outside and go down the path. A bird flying above you drops a rock on your head and you lose 5 health.
                     Woozy and tired, you sit down to recuperate.
                     As you're resting, a knight approaches you and requests to search your person, as there has been a recent robbery in the area and someone has stolen the Queen's diamond dragon trophy.
                  </p>
                  <br>
                  Do you: 
                  <br> 
                  1.Grab the Knight's dagger and show him how skilled with a blade you are
                  <br>
                  2. Insist that you’re the hero of this story and there's no need for him to inspect you (but aren’t we all the heroes of our own story?)
                  <br>
                  3. Tell the Knight you're a lover not a fighter
                  <br>
                  </p>
                  
               </label>
            </div>
            <div class="col-5">
               <label>
               <img border="5px" src="roadside.jpg" alt="roadside" width="500" height="350"></img>
               <br>
               <br>
               <a href="/refuse">
                  <button type="button" class="btn btn-primary btn-lg">1. Grab the Knights Weapon!</button>
                  </a>
                  <a href="/wrong">
                  <button type="submit" class="btn btn-primary btn-lg">2. Insist he's wrong</button><br><br>
                  </a>
                  <a href="/deathJoke">
                  <button type="button" class="btn btn-primary btn-lg">3. I'm a lover not a fighter</button>
                  </a>
               </label>
            </div>
            <div class="col-3">
               <label>
               </label>
            </div>
            <div class="col-3">
               <label>
               </label>
            </div>
         </div>
      </div>
      <br>
      <br>
   </body>
</html>