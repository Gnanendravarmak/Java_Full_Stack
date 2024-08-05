<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Account</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Delete Account</h2>
        <form action="AccountServlet" method="get">
            <input type="hidden" name="action" value="delete" />
            <label for="accountType">Account Type:</label>
            <select id="accountType" name="accountType">
                <option value="savings">Savings</option>
                <option value="current">Current</option>
            </select>
            <label for="userId">User ID:</label>
            <input type="text" id="userId" name="userId" required />
            <input type="submit" value="Delete Account" />
        </form>
    </div>
</body>
</html>
