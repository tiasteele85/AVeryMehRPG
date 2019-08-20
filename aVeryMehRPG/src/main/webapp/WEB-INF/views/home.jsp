<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet type= "img/css" href="https://media.giphy.com/media/lPulTNfJ53X9BglIZc/source.gif">
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<link href="https://fonts.googleapis.com/css?family=Barriecito&display=swap" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<audio autoplay><source src="http://ccmixter.org/content/texasradiofish/texasradiofish_-_Rock_Purple_Wizards_1.mp3">
</audio>

<center>


	<h1>Welcome to a Very Meh RPG !</h1>
	<p>Choose your character, you son of a horse! </p>
	<form action="/story" method="get">
		<select name="Character">
		
			<c:forEach items = "${list}" var = "character">
				<option value = "${character.index}" name="character">${character.name} </option>
			</c:forEach>
		</select>
		<p><input id="choice" type="submit" value="Select"></p>
		</form>
	<iframe src="https://media.giphy.com/media/lPulTNfJ53X9BglIZc/giphy.gif" frameBorder="0">
	</iframe>
	

</center>
	
	
	
</body>
</html>