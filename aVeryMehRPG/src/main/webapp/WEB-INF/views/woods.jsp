<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css"></link>
<link href="https://fonts.googleapis.com/css?family=Barriecito&display=swap" rel="stylesheet">
<meta charset="UTF-8">
<title>Woods</title>
</head>
<body>
<audio autoplay><source src="http://ccmixter.org/content/speck/speck_-_More_Unsettled_Autumn_Snowfall_1.mp3">
</audio>

<h1 id="woods">Later, in the Woods. . .</h1>
<h2>${player}</h2>

<p id ="storyspan"> 

You wake up several hours later in the middle of the woods and realize that your brand-new collectable Batman shoes have been taken
and you’ve lost 5 points of health.

<br>
<br>
Do you:
<br>
<br>
 1. Craft a makeshift pair of shoes out of leaves and walk back towards civilization
 <br>
 2. Go deeper into the woods and accept the fact that no one will believe a stranger took your shoes, so this is now your home.

</p>

<img border="5px" src="forest.jpg" alt = "bar" width="500" height="350"></img>

<a href="/craftShoes">Craft Shoes</a>
<br>
<a href="/deeperInTheWoods">Go Deeper Into the Woods</a>

	
</body>
</html>