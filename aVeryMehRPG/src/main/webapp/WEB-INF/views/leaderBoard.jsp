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
<title>Insert title here</title>
</head>
<body>
	<h1>Leader Board</h1>
	<table>
		<thead>
			<tr>
				<th>Characters</th>
				<th>Average Punches</th>
				<th>Average Kicks</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="character" items="${characters}">
			<tr>
				<td>${ character.name }</td>
				<td>${ character.punches }</td>
				<td>${ character.kicks }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>