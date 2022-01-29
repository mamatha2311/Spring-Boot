<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Form</title>
</head>
<body>
	<form action="addAlien">
		<input type="text" name="aid"><br>
		<input type="text" name="aName"><br>
		<input type="text" name="lang"><br>
		<input type="submit"><br>
	</form>
	
	<form action="getAlien">
		<input type="text" name="aid"><br>
		<input type="submit"><br>
	</form>
</body>
</html>