package com.grayMatter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String uname = request.getParameter("uname");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        RequestDispatcher dispatcher = null;

        try {
            con = DataConnection.getData();

            String checkQuery = "SELECT * FROM employees WHERE username = ? AND email = ? AND password = ?";
            ps = con.prepareStatement(checkQuery);
            ps.setString(1, uname);
            ps.setString(2, email);
            ps.setString(3, pass);
            rs = ps.executeQuery();

            if (rs.next()) {
                dispatcher = request.getRequestDispatcher("success.jsp");
            } else {
                dispatcher = request.getRequestDispatcher("failure.jsp");
            }
            dispatcher.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
