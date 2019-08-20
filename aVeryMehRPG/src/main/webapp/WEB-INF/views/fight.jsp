<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fight Fight Fight</title>
</head>
<link rel="stylesheet" type="text/css" href="style.css">
<link href="https://fonts.googleapis.com/css?family=Barriecito&display=swap" rel="stylesheet">
<body>

<audio autoplay>
      <source src="">
</audio>
	<div>
		<div style="float:left;height:100%;">
			<p></p>
		</div>
		<div style="float:right;">
			<div style="border: 2px solid #000;">
				<table>
					<thead>
						<tr>
						<td>Fight Story</td>
						<td></td>
						</tr>
					</thead>
					<tbody>
						<tr>
						<td>
							<p>${ player }</p>
							<p>${ enemy }</p>
						</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div style="float:right;">
				<p></p>
				<form action="/takeDamage">
					<input type="submit" name="punch" value="punch">
					<input type="submit" name="kick" value="kick">
				</form>
			</div>
		</div>
	</div>
</body>
</html>