<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Data</title>
</head>
<body>
    <h2>Student Data</h2>
    <table border="1">
        <thead>
            <tr>
                <th>USN</th>
                <th>Name</th>
                <th>Email</th>
                <th>Place</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="student" items="${data}">
                <tr>
                    <td><c:out value="${student.usn}" /></td>
                    <td><c:out value="${student.name}" /></td>
                    <td><c:out value="${student.email}" /></td>
                    <td><c:out value="${student.place}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
