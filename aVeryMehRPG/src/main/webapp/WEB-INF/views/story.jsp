<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css"></link>
<link href="https://fonts.googleapis.com/css?family=Barriecito&display=swap" rel="stylesheet">
<meta charset="UTF-8">
<title>Story Page</title>
</head>
<body id="storybody">
<audio autoplay>
      <source src="http://ccmixter.org/content/cyba/cyba_-_new_circle.mp3">
</audio> 
<h1 id="storyheader">Hello ${player} </h1>

<p id="storyspan" >We start off in dark and gloomy bar in the heart of Technologica Woods . 
Our hero sits at the bar after another victorious mission. 
Then out of nowhere the bartender David the master of all Java comes over and places a drink in-front of you and exclaims "Hero! This drink was bought for you by that mysterious man over there!" 
<br>

<br>
Do you:
<br>
1.Drink the beverage 
<br>
2.Decline the drink and leave the bar

</p>

<img border="5px" src="bar.jpg" alt = "bar" width="500" height="350"></img>

<br>
<br>

<a href="/woods">Drink</a>
<br>
<a href="/sideOfRoad">Leave</a>




</body>
</html>