<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Account Management</title>
</head>
<body>
    <h2>Account Management</h2>
    <form action="AccountServlet" method="get">
        <input type="hidden" name="action" value="createSavings" />
        <label for="userId">User ID:</label>
        <input type="text" id="userId" name="userId" required /><br />
        <label for="initialBalance">Initial Balance:</label>
        <input type="text" id="initialBalance" name="initialBalance" required /><br />
        <input type="submit" value="Create Savings Account" />
    </form>

    <form action="AccountServlet" method="get">
        <input type="hidden" name="action" value="createCurrent" />
        <label for="userId">User ID:</label>
        <input type="text" id="userId" name="userId" required /><br />
        <label for="initialBalance">Initial Balance:</label>
        <input type="text" id="initialBalance" name="initialBalance" required /><br />
        <input type="submit" value="Create Current Account" />
    </form>

    <h3>Update Accounts</h3>
    <form action="AccountServlet" method="get">
        <input type="hidden" name="action" value="updateSavings" />
        <label for="userId">User ID:</label>
        <input type="text" id="userId" name="userId" required /><br />
        <label for="balance">New Balance:</label>
        <input type="text" id="balance" name="balance" required /><br />
        <input type="submit" value="Update Savings Account" />
    </form>

    <form action="AccountServlet" method="get">
        <input type="hidden" name="action" value="updateCurrent" />
        <label for="userId">User ID:</label>
        <input type="text" id="userId" name="userId" required /><br />
        <label for="balance">New Balance:</label>
        <input type="text" id="balance" name="balance" required /><br />
        <input type="submit" value="Update Current Account" />
    </form>

    <h3>Delete Accounts</h3>
    <form action="AccountServlet" method="get">
        <input type="hidden" name="action" value="deleteSavings" />
        <label for="userId">User ID:</label>
        <input type="text" id="userId" name="userId" required /><br />
        <input type="submit" value="Delete Savings Account" />
    </form>

    <form action="AccountServlet" method="get">
        <input type="hidden" name="action" value="deleteCurrent" />
        <label for="userId">User ID:</label>
        <input type="text" id="userId" name="userId" required /><br />
        <input type="submit" value="Delete Current Account" />
    </form>
    
    <h4>Display Data</h4>
    <form action="AccountServlet" method="get">
        <input type="hidden" name="action" value="displaySavingAccount" />
        <label for="uid">User ID:</label>
        <input type="text" id="uid" name="uid" required /><br />
        <input type="submit" value="Display Saving Account" />
    </form>
    
</body>
</html>
