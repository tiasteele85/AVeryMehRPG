<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css"></link>
<link href="https://fonts.googleapis.com/css?family=Barriecito&display=swap" rel="stylesheet">
<meta charset="UTF-8">
<title>Knighty Knight</title>
</head>
<body>
<h1>Meet the hero?</h1>
<h2>${player }</h2>

<p id="storyspan"> 
You walk outside and head down the path as you’re walking a bird flying overhead drops a rock on your head and you lose 5 health.
<br>Woozy and tired you sit down to regain your stability. 
<br>As you do a Knight comes up to you and requests to search your person as there has been a recent robbery in the area and someone has stolen the queens diamond dragon trophy
<br>
<br>
Do you: 
<br> 
1.Tell the knight that you refuse his search and suggest he go elsewhere
<br>
2. Insist that you’re the hero of this story and there's no need (but aren’t we all the heroes of our own story?)
<br>
3. Tell the Knight you are a lover not a fighter
<br>
</p>

<img border="5px" src="roadside.jpg" alt = "bar" width="500" height="350"></img>






<a href="/refuse">Refuse!</a>
<br>
<a href="/wrong">Insist he's wrong</a>
<br>
<a href="/deathJoke">I'm a lover not a fighter</a>
	
</body>
</html>