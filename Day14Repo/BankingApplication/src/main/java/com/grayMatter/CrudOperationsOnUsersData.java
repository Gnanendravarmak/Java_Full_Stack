package com.grayMatter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudOperationsOnUsersData {
	
	public static Connection conn;

    

	
	
	static {
		try {
			System.out.println("hiii");
			conn = DataConnection.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static boolean insertData(Users users) throws SQLException {
		
		System.out.println(users);
		
		PreparedStatement ps = conn.prepareStatement(SqlCommands.insertUserDetails);
		ps.setInt(1, users.getUid());
		ps.setString(2, users.getUserName());
		ps.setString(3,  users.getFullName());
		ps.setString(4, users.getPassword());
		return ps.executeUpdate() > 0;
		
	}
	
	public static boolean retriveByUser(String username,String password) throws SQLException {
		
		
		
		PreparedStatement ps = conn.prepareStatement(SqlCommands.retriveData);
		
		try {
			ps.setString(1, username);
			ps.setString(2, password);
			
//			System.out.println(ps.executeQuery());
			
			ResultSet data = ps.executeQuery();
			
			
			
			System.out.println("data: "+data);
			
			return data.next();
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
		
		
		
		
	}
	
	
	
	public static boolean deleteData(int id) throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement(SqlCommands.deleteUserDetails);
		ps.setInt(1, id);
		return ps.executeUpdate() > 0;
	
	}
	
	
	public static boolean updateData(Users users) throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement(SqlCommands.updateUserDetails);
		
		ps.setString(1, users.getUserName());
		ps.setString(2,  users.getFullName());
		ps.setString(3, users.getPassword());
		return ps.executeUpdate() > 0;
		
	}
	
	public static Users dispayData() throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement(SqlCommands.selectectUserDetails);
		
		ResultSet user = ps.getResultSet();
	
		return (Users) user;
		
	}

}
