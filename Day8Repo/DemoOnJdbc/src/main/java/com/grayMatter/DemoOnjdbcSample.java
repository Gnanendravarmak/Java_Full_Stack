package com.grayMatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoOnjdbcSample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Driver loaded");
		
		String url = "jdbc:mysql://localhost:3306/graymatter";
		String userName = "root";
		String password ="password";
		
		Connection con =  DriverManager.getConnection(url, userName, password);
		
		String query = "update regions set region_name=? where region_id = ?";
		
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setString(1,"india");
		ps.setInt(2, 6);
		ps.executeUpdate();
		
		
		Statement st= con.createStatement();
		String qq="select * from regions";
		ResultSet rs = st.executeQuery(qq);
		
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		
			

	}

}
