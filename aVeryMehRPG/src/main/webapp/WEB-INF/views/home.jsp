<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/custom.css">
<link rel="stylesheet" type="text/css" href="style.css"></link>
<link href="https://fonts.googleapis.com/css?family=Barriecito&display=swap" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>

	<h1>Welcome to a Very Meh RPG :/</h1>
	
	<p>Choose your character, you son of a monkey! </p>
	<c:forEach items = "{list}" value = "character">
	<tr>
	<td><a id="{list.name}">{list.name}</a></td>
	</tr>
	</c:forEach>
	<a href="/story">Select</a>
	</center>
	
	
	
</body>
</html>