<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <!DOCTYPE html>
        <html>

        <head>
            <link rel="stylesheet" type="text/css" href="bootstrap.css">
            <link rel="stylesheet" type="text/css" href="newstyle.css">
            <link href="https://fonts.googleapis.com/css?family=Abril+Fatface|Anton|Lexend+Zetta&display=swap" rel="stylesheet">
            <meta charset="UTF-8">
            <title>Choose Your Fighter</title>
        </head>

        <body id="images">

            <form action="/story">
                <!-- Photo Grid -->
                <h1 class="display-3" style="font-family: 'Abril Fatface', cursive">Choose Your Character...</h1>
                <div class="container">
                    <div class="row">
                        <c:forEach var="character" items="${list}">
                            <div class="col-3">
                                <label>
                                    <input type="radio" name="Character" value="${character.index}">
                                    <img src="/img/char-${character.name}.png">
                                    <p><strong>${character.name}</strong></p>
                                </label>
                            </div>
                        </c:forEach>
                    </div>
                </div>

                <br>
                <br>
                <button type="submit" class="btn btn-primary btn-lg">Select Character</button>
                <br>
                <br>
            </form>
<audio autoplay><source src="http://ccmixter.org/content/NiGiD/NiGiD_-_Seventh_Melancholica.mp3"></audio>
        </body>

        </html>