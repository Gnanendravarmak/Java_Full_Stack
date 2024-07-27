
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="LoginServlet">
	<label for="uname">Enter UserName</label>
	<input type="text" name="uname"  id="uname"/>
	<br/>
	<label for="num">Enter PhoneNumber</label>
	<input type="number" name="pnum"  id="pnum"/>
	<br/>
	<label for="pass">password</label>
	<input type="password" name="pass" id="pass"/>
	<br/>
	<input type="submit" value="Submit" >
</form>

</body>
</html>