package com.grayMatter;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class OprationsOnSalaryAccount {
	
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
	
	CrudOperationsOnSalaryAccount saccount = new CrudOperationsOnSalaryAccount();
	
	@Test
  public void testOnRegister() throws SQLException {
  	
  	PreparedStatement ps = conn.prepareStatement(SqlCommands.insertUserDetails);
		ps.setInt(1, 11);
		ps.setString(2, "lak");
		ps.setString(3, "67890");
		ps.setString(4, "87632");
  	assertEquals(1,  ps.executeUpdate());
  }
	
	@Test
	public void testOnCreate() throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement(SqlCommands.insertSalaryAccount);
		ps.setInt(1, 11);
		ps.setInt(2, 2000);
		assertEquals(1, ps.executeUpdate());	
		
	}
	
	
	@Test
	public void testOnUpdate() throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement(SqlCommands.updateSalaryAccount);
		ps.setInt(1, 3333);
		ps.setInt(2, 11);
		assertEquals(0, ps.executeUpdate());	
		
	}
	
	
	@Test
	public void testOnDeposite() throws ClassNotFoundException, SQLException {
		
		PreparedStatement ps = conn.prepareStatement(SqlCommands.depositSalaryAccount);
		
		ps.setInt(1, 99);
		ps.setInt(2, 11);
		
		assertEquals(0, ps.executeUpdate());
	}
	
	
	
	
	@Test
    public void testOnDelete() throws SQLException {
		PreparedStatement ps;
		
		ps = conn.prepareStatement(SqlCommands.deleteSalaryAccount);
		ps.setInt(1, 11);
		ps.executeUpdate();
		
    	ps = conn.prepareStatement(SqlCommands.deleteUserDetails);
		ps.setInt(1, 11);
				
		assertEquals(1, ps.executeUpdate());
    }
	

//    
//	@Test
//	public void testOnAddAccount() throws SQLException {
//		assertEquals(true, saccount.createAccount(10, 1000));
//	}
//	
//	@Test
//	public void testOnUpdateAccount() throws SQLException {
//		assertEquals(true, saccount.updateSavingsAccount(10, 2000));
//	}
//	
//	@Test
//	public void testOnDeposite() throws ClassNotFoundException, SQLException {
//		assertEquals(true, saccount.depositToSavings(10, 50000));
//	}
//	
//	@Test
//	public void testOnWithDraw() throws ClassNotFoundException, SQLException {
//		assertEquals(true, saccount.withdrawFromSavings(10, 3000));
//	}
//	
//	@Test
//	public void testOnRemove() throws SQLException {
//		assertEquals(true, saccount.deleteSavingAccount(10));
//	}
//	
//	
//	@Test
//    public void testOnDelete() throws SQLException {
//    	PreparedStatement ps = conn.prepareStatement(SqlCommands.deleteUserDetails);
//		ps.setInt(1, 10);
//				
//		assertEquals(1, ps.executeUpdate());
//    }
	
}


