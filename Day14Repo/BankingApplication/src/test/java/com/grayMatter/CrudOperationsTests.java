package com.grayMatter;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import org.junit.jupiter.api.Test;

public class CrudOperationsTests {

    static Connection conn;
    
    
    
    static {
    	try {
			conn = DataConnection.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    
    
    @Test
    public void testOnRegister() throws SQLException {
    	
    	PreparedStatement ps = conn.prepareStatement(SqlCommands.insertUserDetails);
		ps.setInt(1, 10002);
		ps.setString(2, "vimal");
		ps.setString(3, "12345");
		ps.setString(4, "87632");
    	assertEquals(1,  ps.executeUpdate());
    } 
   
    
    
//    @Test
//    public void testOnLogin() throws SQLException {
//    	assertEquals(true, CrudOperationsOnUsersData.retriveByUser("varma","12345"));
//    }
    
    @Test
    public void testOnUpdate() throws SQLException {
    	
    	PreparedStatement ps = conn.prepareStatement(SqlCommands.updateUserDetails);
		
		ps.setString(1, "varmak");
		ps.setString(2,  "varmak@gmail.com");
		ps.setString(3, "123");
		ps.setInt(4, 10002);
		
    	assertEquals(0, ps.executeUpdate());
    }
    
    @Test
    public void testOnDelete() throws SQLException {
    	PreparedStatement ps = conn.prepareStatement(SqlCommands.deleteUserDetails);
		ps.setInt(1, 10002);
				
		assertEquals(1, ps.executeUpdate());
    }

    

}
