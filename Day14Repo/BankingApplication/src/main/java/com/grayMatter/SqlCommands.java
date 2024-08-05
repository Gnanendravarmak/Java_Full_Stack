package com.grayMatter;

public class SqlCommands {
	
	public static final String selectectSalaryAccount = "select * from savingsAccount";
	public static final String insertSalaryAccount = "insert into savingsAccount (u_id,balance) values (?,?)";
	public static final String deleteSalaryAccount = "delete from savingsAccount where u_id=?";
	public static final String updateSalaryAccount = "update savingsAccount set balance=? where u_id =?";
	public static final String retriveSalaryDataById = "select * from savingsAccount wherer u_id=?";
	public static final String depositSalaryAccount = "UPDATE savingsaccount SET balance = balance + ? WHERE u_id = ?";

	
	
	
	public static final String selectectCurrentAccount = "select * from currentAccount";
	public static final String insertCurrentAccount = "insert into currentAccount (u_id,balance) values (?,?)";
	public static final String deleteCurrentAccount = "delete from currentAccount where u_id=?";
	public static final String updateCurrentAccount = "update currentAccount set balance=? where u_id =?";
	public static final String retriveCurrentDataById = "select * from currentAccount where u_id=?";
	public static final String depositCurrentAccount = "UPDATE currentaccount SET balance = balance + ? WHERE u_id = ?";


	
	
	
	public static final String selectectUserDetails = "select * from users";
	public static final String retriveData = "select * from users where username=? and password=?";
	public static final String insertUserDetails = "insert into users (uid,userName,password,fullName) values (?,?,?,?)";
	public static final String deleteUserDetails = "delete from users where uid=?";
	public static final String updateUserDetails = "update users set userName=?, password=?,fullName=? where uid =?";
	
	
	

}
