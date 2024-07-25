package com.grayMatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoOnJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Driver loaded");
		
		String url = "jdbc:mysql://localhost:3306/graymatter";
		String userName = "root";
		String password ="password";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		System.out.println("Connected");
		
		Statement st= con.createStatement();
		
		String query = "select first_name,employee_id from employees";
		
		ResultSet rs = st.executeQuery(query);
		
		
		while(rs.next()) {
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			
		}
		
		query = "insert into regions values(?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, 5);
		ps.setString(2, "Antartica");
		int row= ps.executeUpdate();
		
		System.out.println("row inserted :" + row);
		
		
		
	}

}
