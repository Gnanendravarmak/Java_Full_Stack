<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Account Management</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h2>Account Management</h2>
        
        <form action="AccountServlet" method="get">
            <input type="hidden" name="action" value="create" />
            <label for="accountType">Account Type:</label>
            <select id="accountType" name="accountType">
                <option value="savings">Savings</option>
                <option value="current">Current</option>
            </select>
            <label for="userId">User ID:</label>
            <input type="text" id="userId" name="userId" required />
            <label for="initialBalance">Initial Balance:</label>
            <input type="text" id="initialBalance" name="initialBalance" required />
            <input type="submit" value="Create Account" />
        </form>

        <h3>Update Accounts</h3>
        <form action="AccountServlet" method="get">
            <input type="hidden" name="action" value="update" />
            <label for="accountType">Account Type:</label>
            <select id="accountType" name="accountType">
                <option value="savings">Savings</option>
                <option value="current">Current</option>
            </select>
            <label for="userId">User ID:</label>
            <input type="text" id="userId" name="userId" required />
            <label for="balance">New Balance:</label>
            <input type="text" id="balance" name="balance" required />
            <input type="submit" value="Update Account" />
        </form>

        <h3>Delete Accounts</h3>
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

        <h4>Display Data</h4>
        <form action="AccountServlet" method="get">
            <input type="hidden" name="action" value="displayData" />
            <label for="accountType">Account Type:</label>
            <select id="accountType" name="accountType">
                <option value="savings">Savings</option>
                <option value="current">Current</option>
            </select>
            <label for="userId">User ID:</label>
            <input type="text" id="userId" name="userId" required />
            <input type="submit" value="Display Account" />
        </form>

        <h4>Withdraw Funds</h4>
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

        <h4>Deposit Funds</h4>
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
