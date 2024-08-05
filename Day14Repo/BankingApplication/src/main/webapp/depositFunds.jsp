<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Deposit Funds</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Deposit Funds</h2>
        <form action="AccountServlet" method="get">
            <input type="hidden" name="action" value="deposit" />
            <label for="accountType">Account Type:</label>
            <select id="accountType" name="accountType">
                <option value="savings">Savings</option>
                <option value="current">Current</option>
            </select>
            <label for="userId">User ID:</label>
            <input type="text" id="userId" name="userId" required />
            <label for="amount">Amount:</label>
            <input type="text" id="amount" name="amount" required />
            <input type="submit" value="Deposit" />
        </form>
    </div>
</body>
</html>
