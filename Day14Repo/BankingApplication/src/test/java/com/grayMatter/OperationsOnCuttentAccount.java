package com.grayMatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class OperationsOnCuttentAccount {
	
static Connection conn;
    
    
    
    static {
    	try {
			conn = DataConnection.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
	    
    CrudOperationOnCurrentAccount curraccount = new CrudOperationOnCurrentAccount();
    
    
    
    @Test
    public void testOnRegister() throws SQLException {
    	
    	PreparedStatement ps = conn.prepareStatement(SqlCommands.insertUserDetails);
    	ps.setInt(1, 199);
    	ps.setString(2, "ashoks");
    	ps.setString(3, "8888");
    	ps.setString(4, "987654321");
    	assertEquals(1, ps.executeUpdate());
    	
    }
    
    
    @Test
	public void testOnCreate() throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement(SqlCommands.insertCurrentAccount);
		ps.setInt(1, 199);
		ps.setInt(2, 2000);
		assertEquals(1, ps.executeUpdate());	
		
	}
    
    
	@Test
	public void testOnUpdate() throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement(SqlCommands.updateCurrentAccount);
		ps.setInt(1, 3333);
		ps.setInt(2, 199);
		assertEquals(0, ps.executeUpdate());	
		
	}
	
	
	@Test
	public void testOnDeposite() throws ClassNotFoundException, SQLException {
		
		PreparedStatement ps = conn.prepareStatement(SqlCommands.depositCurrentAccount);
		
		ps.setInt(1, 99);
		ps.setInt(2, 199);
		
		assertEquals(0, ps.executeUpdate());
	}
    
    
	@Test
  public void testOnDelete() throws SQLException {
		PreparedStatement ps;
		
		ps = conn.prepareStatement(SqlCommands.deleteCurrentAccount);
		ps.setInt(1, 199);
		ps.executeUpdate();
		
		ps = conn.prepareStatement(SqlCommands.deleteUserDetails);
		ps.setInt(1, 199);
				
		assertEquals(1, ps.executeUpdate());
  }
    
    
	
//	@Test
//  public void testOnRegister() throws SQLException {
//  	
//  	PreparedStatement ps = conn.prepareStatement(SqlCommands.insertUserDetails);
//		ps.setInt(1, 111);
//		ps.setString(2, "kill");
//		ps.setString(3, "4321");
//		ps.setString(4, "56789");
//  	assertEquals(1,  ps.executeUpdate());
//  }
//	
//	@Test
//	public void testOnCreate() throws SQLException {
//		
//		PreparedStatement ps = conn.prepareStatement(SqlCommands.insertCurrentAccount);
//		ps.setInt(1, 111);
//		ps.setInt(2, 2000);
//		assertEquals(1, ps.executeUpdate());	
//		
//	}
//	
//	
//	@Test
//	public void testOnUpdate() throws SQLException {
//		
//		PreparedStatement ps = conn.prepareStatement(SqlCommands.updateCurrentAccount);
//		ps.setInt(1, 3333);
//		ps.setInt(2, 111);
//		assertEquals(0, ps.executeUpdate());	
//		
//	}
//	
//	
//	@Test
//	public void testOnDeposite() throws ClassNotFoundException, SQLException {
//		
//		PreparedStatement ps = conn.prepareStatement(SqlCommands.depositCurrentAccount);
//		
//		ps.setInt(1, 99);
//		ps.setInt(2, 111);
//		
//		assertEquals(0, ps.executeUpdate());
//	}
//	
//	
//	
//	
//	@Test
//    public void testOnDelete() throws SQLException {
//		PreparedStatement ps;
//		
//		ps = conn.prepareStatement(SqlCommands.deleteCurrentAccount);
//		ps.setInt(1, 111);
//		ps.executeUpdate();
//		
//    	ps = conn.prepareStatement(SqlCommands.deleteUserDetails);
//		ps.setInt(1, 111);
//				
//		assertEquals(1, ps.executeUpdate());
//    }

}
