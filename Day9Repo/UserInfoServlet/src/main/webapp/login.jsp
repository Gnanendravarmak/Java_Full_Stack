<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="UserServlet">
	
		<label>Enter Username:</label>
		<input type="text" name="uname">
		
		<label>Enter Email:</label>
		<input type="text" name="email">
		
		<label>Enter PhoneNumber:</label>
		<input type="text" name="phone">
		
		<label>Enter Password:</label>
		<input type="password" name="pass">
		
		<input type="submit" value="Submit">
	
	</form>

</body>
</html>