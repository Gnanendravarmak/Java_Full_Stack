<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Register</h2>
        <form action="UserServlet" method="get">
            <input type="hidden" name="action" value="register" />
            <label for="id">Id:</label>
            <input type="number" id="id" name="id" required /><br />
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required /><br />
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required /><br />
            <label for="fullName">Full Name:</label>
            <input type="text" id="fullname" name="fullname" required /><br />
            <input type="submit" value="Register" />
        </form>
    </div>
</body>
</html>
