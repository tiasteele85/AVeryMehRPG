<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="bootstrap.css">
           <link rel="stylesheet" type="text/css" href="newstyle.css">
           <link href="https://fonts.googleapis.com/css?family=Bangers%7CBarriecito%7CLuckiest+Guy%7CPress+Start+2P%7CSacramento&display=swap" rel="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1 class="lead-header">Leader Board</h1>
    <div class="container">
    <table class="table leader-table">
        <thead class="leader-table-headers">
            <tr>
                <th>Characters</th>
                <th>Average Punches</th>
                <th>Average Kicks</th>
                <th>Total Wins</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="character" items="${characters}">
            <tr>
                <td>${ character.name }</td>
                <td><fmt:formatNumber type="number" maxFractionDigits="1" value="${ character.punches }"/></td>
                <td><fmt:formatNumber type="number" maxFractionDigits="1" value="${ character.kicks }"/></td>
                <td>${character.count }</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
    </div>
    <div class="display-7">
    <p style="font-size:200%;"><a href="/">Home</a></p>
    </div>
</body>
</html>