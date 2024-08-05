package com.grayMatter.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {
	
	private String driverName;
	private String url;
	private String uname;
	private String pwd;
	
	
	public DataConnection(String driverName, String url, String uname, String pwd) {
		super();
		this.driverName = driverName;
		this.url = url;
		this.uname = uname;
		this.pwd = pwd;
	}


	public DataConnection() {
		super();
	}


	public String getDriverName() {
		return driverName;
	}


	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	@Override
	public String toString() {
		return "DataConnection [driverName=" + driverName + ", url=" + url + ", uname=" + uname + ", pwd=" + pwd + "]";
	}


	public Connection getConnection() throws SQLException, ClassNotFoundException {
		
		Class.forName(driverName);
		
		return DriverManager.getConnection(url,uname, pwd);
				
	}
	
	
	
	
	

}
