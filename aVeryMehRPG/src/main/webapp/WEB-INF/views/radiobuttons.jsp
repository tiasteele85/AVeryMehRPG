<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <!DOCTYPE html>
    <html>

    <head>
        <link rel="stylesheet" type="text/css" href="bootstrap.css">
        <link rel="stylesheet" type="text/css" href="newstyle.css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet">
        <meta charset="UTF-8">
        <title>Test</title>
    </head>

    <body id="images">
<form action="/story">
        <!-- Photo Grid -->
        
        <div class="container">
        	  <div class="row">
        	  <c:forEach var="character" items="${list}">
   				 <div class="col-3">
                   <label>
                    <input type="radio" name="Character" value="${character.index}">
                    <img src="/img/char-${character.name}.png">
                   </label>
   				 </div>
   			  </c:forEach>
   			  </div>
        </div>
        
        <%--
        <div class="row">
            <div class="column">
                <label>
                    <input type="radio" name="image" data-col="1">
                    <img src="/img/char-Bard.png" style="width:8%">
                </label>
                <label>
                    <input type="radio" name="image" data-col="2">
                    <img src="/img/char-Barbarian.png" style="width:8%">
                </label>
                <label>
                    <input type="radio" name="image" data-col="3">
                    <img src="/img/char-cleric.png" style="width:8%">
                </label>
                <label>
                    <input type="radio" name="image" data-col="4">
                    <img src="/img/char-druid.png" style="width:8%">
                </label>
            </div>
        </div>
        <div class="row">
            <div class="column">
                <label>
                    <input type="radio" name="image" data-col="5">
                    <img src="/img/char-fighter.png" style="width:8%">
                </label>
                <label>
                    <input type="radio" name="image" data-col="6">
    				<img src="/img/char-paladin.png" style="width:8%">
    			</label>
    			<label>
  					<input type="radio" name="image" data-col="7">
   					 <img src="/img/char-warlock.png" style="width:8%">
   				 </label>
   				 <label>
  					<input type="radio" name="image" data-col="8">
  					<img src="/img/char-wizard.png" style="width:8%">
  			     </label>
			</div>
		</div>

  <div class="row"> 
 <div class="column">
 <label>
  	<input type="radio" name="image" data-col="9">
 	 <img src="/img/char-monk.png" style="width:8%">
 	 </label>
 	 <label>
  	<input type="radio" name="image" data-col="10">
 	 <img src="/img/char-sorcerer.png" style="width:8%">
 	 </label>
 	 <label>
  	<input type="radio" name="image" data-col="11">
 	 <img src="/img/char-rogue.png" style="width:8%">
 	 </label>
 	 </label>
 	 <label>
  	<input type="radio" name="image" data-col="12">
 	 <img src="/img/char-ranger.png" style="width:8%">
 	 </label>
 	</div>
   </div>    
   
  --%>
         <button type="submit" class="btn btn-primary btn-lg">Select Character</button>
      </form>

   </body>
</html>