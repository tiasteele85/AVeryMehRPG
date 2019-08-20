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
<h1>We're in the woods</h1>
<h2>${player}</h2>

<p id ="storyspan"> 
<br>
You wake up several hours in the middle of the woods and realize that your brand-new collectable Batman shoes have been taken
and you’ve lost 5 points of health

<br>
<br>
Do you:
<br>
<br>
 1. Craft makeshift pair of shoes out of leaves and walk back towards civilizations
 <br>
 2. Go deeper into the woods and just accept the fact that no one will believe you that a stranger took your shoes so that this is now your home.

</p>

<img border="5px" src="bar.jpg" alt = "bar" width="500" height="350"></img>

<body>
<audio autoplay><source src="http://ccmixter.org/content/speck/speck_-_More_Unsettled_Autumn_Snowfall_1.mp3">
</audio>

<img border="5px" src="forest.jpg" alt = "bar" width="500" height="350"></img>
<table id="storytable">
	<tr>
<th><a href="/craftShoes">Craft Shoes</a></th>
<th><a href="/deeperInTheWoods">Go Deeper</a></th>

	</tr>
</table>
</body>
</html>