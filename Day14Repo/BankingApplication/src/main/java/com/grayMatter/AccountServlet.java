package com.grayMatter;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AccountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AccountServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String accountType = request.getParameter("accountType");
        String userIdParam = request.getParameter("userId");
        String initialBalanceParam = request.getParameter("initialBalance");
        String balanceParam = request.getParameter("balance");
        String amountParam = request.getParameter("amount");
        
        System.out.println(action + " " + accountType);

        if (action == null || accountType == null || userIdParam == null) {
            response.sendRedirect("error.jsp");
            return;
        }

        int userId = Integer.parseInt(userIdParam);
        int initialBalance = initialBalanceParam != null ? Integer.parseInt(initialBalanceParam) : 0;
        int balance = balanceParam != null ? Integer.parseInt(balanceParam) : 0;
        int amount = amountParam != null ? Integer.parseInt(amountParam) : 0;

        try {
            switch (action) {
                case "create":
                    if (createAccount(accountType, userId, initialBalance)) {
                        response.sendRedirect("home.jsp");
                    } else {
                        response.sendRedirect("error.jsp");
                    }
                    break;

                case "update":
                    if (updateAccount(accountType, userId, balance)) {
                        response.sendRedirect("home.jsp");
                    } else {
                        response.sendRedirect("error.jsp");
                    }
                    break;

                case "delete":
                    if (deleteAccount(accountType, userId)) {
                        response.sendRedirect("home.jsp");
                    } else {
                        response.sendRedirect("error.jsp");
                    }
                    break;

                case "displayData":
                    displayAccount(accountType, userId, request, response);
                    break;

                case "withdraw":
                    if (withdrawAmount(accountType, userId, amount)) {
                        response.sendRedirect("home.jsp");
                    } else {
                        response.sendRedirect("error.jsp");
                    }
                    break;

                case "deposit":
                    if (depositAmount(accountType, userId, amount)) {
                        response.sendRedirect("home.jsp");
                    } else {
                        response.sendRedirect("error.jsp");
                    }
                    break;

                default:
                    response.sendRedirect("error.jsp");
                    break;
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }

    private boolean createAccount(String accountType, int userId, int initialBalance) throws SQLException {
        if ("savings".equals(accountType)) {
            return CrudOperationsOnSalaryAccount.createAccount(userId, initialBalance);
        } else if ("current".equals(accountType)) {
            return CrudOperationOnCurrentAccount.createAccount(userId, initialBalance);
        }
        return false;
    }

    private boolean updateAccount(String accountType, int userId, int newBalance) throws SQLException {
        if ("savings".equals(accountType)) {
            return CrudOperationsOnSalaryAccount.updateSavingsAccount(userId, newBalance);
        } else if ("current".equals(accountType)) {
            return CrudOperationOnCurrentAccount.updateCurrentAccount(userId, newBalance);
        }
        return false;
    }

    private boolean deleteAccount(String accountType, int userId) throws SQLException {
        if ("savings".equals(accountType)) {
            return CrudOperationsOnSalaryAccount.deleteSavingAccount(userId);
        } else if ("current".equals(accountType)) {
            return CrudOperationOnCurrentAccount.deleteCurrentAccount(userId);
        }
        return false;
    }

    private void displayAccount(String accountType, int userId, HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        Users user = null;
        if ("savings".equals(accountType)) {
            user = CrudOperationsOnSalaryAccount.displaySavingAccountById(userId);
        } else if ("current".equals(accountType)) {
            user = CrudOperationOnCurrentAccount.displayCurrentAccountById(userId);
        }

        if (user != null) {
            request.setAttribute("user", user.getUserName());
            request.getRequestDispatcher("display.jsp").forward(request, response);
        } else {
            response.sendRedirect("error.jsp");
        }
    }

    private boolean withdrawAmount(String accountType, int userId, int amount) throws SQLException, ClassNotFoundException {
        if ("savings".equals(accountType)) {
            return CrudOperationsOnSalaryAccount.withdrawFromSavings(userId, amount);
        } else if ("current".equals(accountType)) {
            return CrudOperationOnCurrentAccount.withdrawFromCurrent(userId, amount);
        }
        return false;
    }

    private boolean depositAmount(String accountType, int userId, int amount) throws SQLException, ClassNotFoundException {
        if ("savings".equals(accountType)) {
            return CrudOperationsOnSalaryAccount.depositToSavings(userId, amount);
        } else if ("current".equals(accountType)) {
            return CrudOperationOnCurrentAccount.depositToCurrent(userId, amount);
        }
        return false;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
