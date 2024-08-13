<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ IsElIgnore="false" taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>
</head>
<body>
<div>
<form action="emp">
<button type="submit">Submit</button>
</form>
    <c:forEach items="${data}" var="emp">
        <p>ID: ${data.id}</p>
        <p>Name: ${emp.name}</p>
        <p>Salary: ${emp.salary}</p>
    </c:forEach>
</div>
</body>
</html>
