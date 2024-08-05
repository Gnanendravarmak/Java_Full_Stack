<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Withdraw Funds</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Withdraw Funds</h2>
        <form action="AccountServlet" method="get">
            <input type="hidden" name="action" value="withdraw" />
            <label for="accountType">Account Type:</label>
            <select id="accountType" name="accountType">
                <option value="savings">Savings</option>
                <option value="current">Current</option>
            </select>
            <label for="userId">User ID:</label>
            <input type="text" id="userId" name="userId" required />
            <label for="amount">Amount:</label>
            <input type="text" id="amount" name="amount" required />
            <input type="submit" value="Withdraw" />
        </form>
    </div>
</body>
</html>
