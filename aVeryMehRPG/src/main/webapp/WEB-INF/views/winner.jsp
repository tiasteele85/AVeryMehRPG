<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<link
	href="https://fonts.googleapis.com/css?family=Barriecito&display=swap"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>End of Game</title>
</head>
<body>

	<h1 text-align="center" style="color: #FF0000; background: black">You Win!</h1>
	<table>
		<tr>
			<th>Character:</th>
			<td>${ character.name }</td>
		</tr>
		<tr>
			<th>Enemy:</th>
			<td>${character.enemy }</td>
		</tr>
		<tr>
			<th>Story Choices:</th>
			<td>${ character.description }</td>
		</tr>
		<tr>
			<th>Number of Punches:</th>
			<td>${ character.punchCount }</td>
		</tr>
		<tr>
			<th>Number of Kicks:</th>
			<td>${ character.kickCount }</td>
		</tr>
	</table>


	<p>
		<a href="/killer">Home</a>
	</p>


</body>
</html>