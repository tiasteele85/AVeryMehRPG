<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <!DOCTYPE html>
        <html>

        <head>
            <link rel="stylesheet" type="text/css" href="bootstrap.css">
            <link rel="stylesheet" type="text/css" href="newstyle.css">
            <meta charset="ISO-8859-1">
            <link href="https://fonts.googleapis.com/css?family=Bangers|Barriecito|Luckiest+Guy|Press+Start+2P|Sacramento|Abril+Fatface&display=swap" rel="stylesheet">
            <meta charset="UTF-8">
            <title>Woods</title>
        </head>

        <body>
            <!--audio autoplay><source src="http://ccmixter.org/content/speck/speck_-_More_Unsettled_Autumn_Snowfall_1.mp3">
</audio-->
<br>
<br>
            <h1 class="display-3" style="font-family: 'Abril Fatface', cursive">Later, in the woods . . .</h1>
            <div class="container" style="font1">
                <div class="row">
                    <div class="col-6">
                        <label id="font2">
                            <p>You wake up several hours later in the middle of the woods and realize that your brand-new collectable Batman shoes have been taken and you’ve lost 5 points of health.</p>
                            <br>

                            <p> Do you:
                                <br>1. Craft a makeshift pair of shoes out of leaves and walk back towards civilization
                                <br>2. Go deeper into the woods and accept the fact that no one will believe a stranger took your shoes, so this is now your home.</p>
                            <a href="/craftShoes">
                                <button type="button" class="btn btn-primary btn-lg">1. Craft Shoes</button>
                            </a>
                            <a href="/deeperInTheWoods">
                                <button type="submit" class="btn btn-primary btn-lg">2. Go deeper into the woods</button>
                            </a>
                        </label>
                    </div>
                    <div class="col-5">
                        <label>
                            <img border="5px" src="forest.jpg" alt="bar" width="500" height="350"></img>
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
        </body>

        </html>