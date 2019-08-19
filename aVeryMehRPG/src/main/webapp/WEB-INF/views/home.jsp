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

<center>

	<h1>Welcome to a Very Meh RPG :/</h1>
	<div style="width:21%;height:3;padding-bottom:10%;position:relative;">
	<iframe src="https://giphy.com/embed/lPulTNfJ53X9BglIZc" width="100%" height="100%" style="position:absolute" frameBorder="0">
	</iframe>
	</div>
	
	<p>Choose your character, you son of a monkey! </p>
	<form action="/story" method="get">
		<select name="Character">
			<c:forEach items = "${list}" var = "character">
				<option value = "${character.name}" name="character">${character.name} </option>
			</c:forEach>
		</select>
		<p><input type="submit" value="Select"></p>
		</form>
		
						<br></br>

</center>
	
	
	
</body>
</html>