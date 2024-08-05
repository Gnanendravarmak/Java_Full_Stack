<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>User Management</title>
</head>
<body>
    <h2>User Management</h2>
    <form action="UserServlet" method="get">
        <input type="hidden" name="action" value="updateUser" />
        <label for="userId">User ID:</label>
        <input type="text" id="userId" name="userId" required /><br />
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required /><br />
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required /><br />
        <label for="fullName">Full Name:</label>
        <input type="text" id="fullName" name="fullName" required /><br />
        <input type="submit" value="Update User" />
    </form>

    <form action="UserServlet" method="get">
        <input type="hidden" name="action" value="deleteUser" />
        <label for="userId">User ID:</label>
        <input type="text" id="userId" name="userId" required /><br />
        <input type="submit" value="Delete User" />
    </form>
</body>
</html>
