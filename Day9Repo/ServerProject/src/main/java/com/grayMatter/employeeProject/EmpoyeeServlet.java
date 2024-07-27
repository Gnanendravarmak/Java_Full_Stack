package com.grayMatter.employeeProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpoyeeServlet
 */
public class EmpoyeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpoyeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Connection con = null;
		DataConnection dc =new DataConnection();
		PreparedStatement ps = null;
		
		try {
			con = dc.getData();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		out.print("Connected");
		
		String rid = request.getParameter("rid");
		String rname = request.getParameter("rname");
		
		String query="Insert into regions values(?,?)";
		
		try {
			ps=con.prepareStatement(query);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			ps.setInt(1, Integer.parseInt(rid));
			ps.setString(2, rname);
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		out.print("row inserted");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
