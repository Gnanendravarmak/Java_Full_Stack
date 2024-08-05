package com.grayMatter;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("action");
		
		System.out.println(action);
		
		if(action.equalsIgnoreCase("register")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String userName = request.getParameter("username");
			String fullNmae = request.getParameter("fullname");
			String password = request.getParameter("password");
			
			Users user = new Users(id, userName, fullNmae, password);
			
			
			try {
				if(CrudOperationsOnUsersData.insertData(user)) {
					response.sendRedirect("login.jsp");
				} else {
					response.sendRedirect("error.jsp");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} else if(action.equalsIgnoreCase("updateUser")) {
			String userName = request.getParameter("username");
			String fullNmae = request.getParameter("fullname");
			String password = request.getParameter("password");
			
			Users user = Users.builder()
					.userName(userName)
					.fullName(fullNmae)
					.password(password)
					.build();
			
			try {
				if(CrudOperationsOnUsersData.updateData(user)) {
					response.sendRedirect("home.jsp");
				} else {
					response.sendRedirect("error.jsp");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		else if ("deleteUser".equals(action)) {
            int userId = Integer.parseInt(request.getParameter("userId"));
            try {
				if (CrudOperationsOnUsersData.deleteData(userId)) {
				    response.sendRedirect("home.jsp");
				} else {
				    response.sendRedirect("error.jsp");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }else if("login".equals(action)) {
        	
        	String username = request.getParameter("username");
        	String password = request.getParameter("password");
        	
        	System.out.println(username+" "+password);
        	
        	try {
				if(CrudOperationsOnUsersData.retriveByUser(username,password)) {
					System.out.println("Login page");
					response.sendRedirect("home.jsp");
				}else {
					response.sendRedirect("error.jsp");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
