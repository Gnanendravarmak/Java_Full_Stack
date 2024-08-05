<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Login</h2>
        <form action="UserServlet" method="get">
            <input type="hidden" name="action" value="login" />
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required /><br />
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required /><br />
            <input type="submit" value="Login" />
        </form>
    </div>
</body>
</html>
