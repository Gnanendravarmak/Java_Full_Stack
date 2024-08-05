package com.grayMatter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudOperationsOnSalaryAccount {
	
static Connection conn = null;
	
	static {
		try {
			conn = DataConnection.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static boolean createAccount(int uid,int initialAmmount) throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement(SqlCommands.insertSalaryAccount);
		
		ps.setInt(1, uid);
		ps.setInt(2,  initialAmmount);
		return ps.executeUpdate() > 0;
		
	}
	
	
	
	public static boolean deleteSavingAccount(int id) throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement(SqlCommands.deleteSalaryAccount);
		ps.setInt(1, id);
		return ps.executeUpdate() > 0;
	
	}
	
	
	public static boolean updateSavingsAccount(int uid, int balance) throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement(SqlCommands.updateSalaryAccount);
		
		
		ps.setInt(1, balance);
		ps.setInt(2, uid);
		System.out.println(ps.executeUpdate());
		return ps.executeUpdate() > 0;
		
	}
	
	public static Users displaySavingAccountById(int id) throws SQLException {
	    PreparedStatement ps = conn.prepareStatement(SqlCommands.retriveSalaryDataById);
	    ps.setInt(1, id);
	    ResultSet rs = ps.executeQuery();
	    
	    System.out.println(rs);
	    
	    return (Users) rs;
	}
	
	public static Users dispaySavingAccount() throws SQLException {
		
		PreparedStatement ps = conn.prepareStatement(SqlCommands.selectectSalaryAccount);
		
		ResultSet user = ps.getResultSet();
	
		return (Users) user;
		
	}
	
	
	public static boolean depositToSavings(int userId, int amount) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DataConnection.getConnection(); // Assuming you have a utility to get the connection
            conn.setAutoCommit(false);

            // Deposit amount
            String depositSQL = "UPDATE savingsaccount SET balance = balance + ? WHERE u_id = ?";
            pstmt = conn.prepareStatement(depositSQL);
            pstmt.setInt(1, amount);
            pstmt.setInt(2, userId);
            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                conn.commit();
                return true;
            } else {
                conn.rollback();
                return false;
            }
        } catch (SQLException e) {
            if (conn != null) {
                conn.rollback();
            }
            throw e;
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }



	public static boolean withdrawFromSavings(int userId, int amount) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DataConnection.getConnection(); // Assuming you have a utility to get the connection
            conn.setAutoCommit(false);

            // Check if the user has sufficient balance
            String checkBalanceSQL = "SELECT balance FROM savingsaccount WHERE u_id = ?";
            pstmt = conn.prepareStatement(checkBalanceSQL);
            pstmt.setInt(1, userId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int currentBalance = rs.getInt("balance");
                if (currentBalance < amount) {
                    return false; // Not enough funds
                }
            } else {
                return false; // Account does not exist
            }

            // Withdraw amount
            String withdrawSQL = "UPDATE savingsaccount SET balance = balance - ? WHERE u_id = ?";
            pstmt = conn.prepareStatement(withdrawSQL);
            pstmt.setInt(1, amount);
            pstmt.setInt(2, userId);
            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                conn.commit();
                return true;
            } else {
                conn.rollback();
                return false;
            }
        } catch (SQLException e) {
            if (conn != null) {
                conn.rollback();
            }
            throw e;
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        
	}
	
	
//	public static Users dispaySavingAccountById(int id) throws SQLException {
//		
//		PreparedStatement ps = conn.prepareStatement(SqlCommands.retriveSalaryDataById);
//		
//		ps.setInt(1,id);
//		
//		ResultSet user = ps.getResultSet();
//		
//		System.out.println(user);
//	
//		return (Users) user;
//		
//	}
	
	
	
	

}
