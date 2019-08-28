<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="bootstrap.css">
            <link rel="stylesheet" type="text/css" href="newstyle.css">
            <link href="https://fonts.googleapis.com/css?family=Bangers|Barriecito|Luckiest+Guy|Press+Start+2P|Sacramento&display=swap" rel="stylesheet">
<meta charset="UTF-8">
<title>Knighty Knight</title>
</head>
<body>
<br>
<h1 id="sockless">Meet the hero?</h1>
<h2>${player }</h2>

<p id="storyspan"> 
You walk outside and go down the path. A bird flying above you drops a rock on your head and you lose 5 health.
<br>Woozy and tired, you sit down to recuperate. 
<br>As you're resting, a knight approaches you and requests to search your person, as there has been a recent robbery in the area and someone has stolen the Queen's diamond dragon trophy.
<br>
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

<img border="5px" src="roadside.jpg" alt = "bar" width="500" height="350"></img>





<p id="options">
<a href="/refuse">Grab the Knights Weapon!</a>
<br>
<a href="/wrong">Insist he's wrong</a>
<br>
<a href="/deathJoke">I'm a lover not a fighter</a>
	</p>
</body>
</html>