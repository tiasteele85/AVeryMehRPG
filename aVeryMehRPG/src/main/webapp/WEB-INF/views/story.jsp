<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <!DOCTYPE html>
        <html>

        <head>
            <link rel="stylesheet" type="text/css" href="bootstrap.css">
            <link rel="stylesheet" type="text/css" href="newstyle.css">
            <link href="https://fonts.googleapis.com/css?family=Abril+Fatface|Anton|Lexend+Zetta&display=swap" rel="stylesheet">
            <meta charset="UTF-8">
            <title>Story Page</title>
        </head>

        <body>
            <!--audio autoplay>
         <source src="http://ccmixter.org/content/cyba/cyba_-_new_circle.mp3">
         </audio-->
         <br>
         <br>
            <h1 class="display-3" style="font-family: 'Abril Fatface', cursive">Hello ${player} . . .</h1>
            <div class="container" style="font1">
                <div class="row">
                    <div class="col-6">
                        <label id="font2">
                            <p>We start off in a dark and gloomy bar in the heart of Technologica Woods. The ${player} sits at the bar after another victorious mission. All of a sudden, the bartender 'David' (Master of all Java) places a drink in-front of you and exclaims "Hero! This drink was bought for you by that mysterious man over there!"</p>
                            <br>

                            <p> Do you:
                                <br>1. Drink the beverage
                                <br>2. Decline the drink and leave the bar</p>
                            <a href="/woods">
                                <button type="button" class="btn btn-primary btn-lg">1. Drink</button>
                            </a>
                            <a href="/sideOfRoad">
                                <button type="submit" class="btn btn-primary btn-lg">2. Leave</button>
                            </a>
                        </label>
                    </div>
                    <div class="col-5">
                        <label>
                            <img border="5px" src="bar.jpg" alt="bar" width="500" height="350"></img>
                        </label>
                    </div>
                    <div class="col-3">
                        <label>

                        </label>
                    </div>
                    <div class="col-3">
                        <label>

                        </label>
                    </div>

                </div>
            </div>

            <br>
            <br>

        </body>

        </html>