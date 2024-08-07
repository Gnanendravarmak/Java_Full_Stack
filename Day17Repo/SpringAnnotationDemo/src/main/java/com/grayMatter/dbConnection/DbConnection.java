package com.grayMatter.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@ToString
@Component
public class DbConnection {

    private String driver;
    private String url;
    private String uname;
    private String pass;

    @javax.annotation.PostConstruct
    public void setConnection() {
    	System.out.println("Db");
        driver = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/graymatter";
        uname = "root";
        pass = "password";
    }

    
    public Connection getConnection() throws ClassNotFoundException, SQLException {
    	Class.forName(driver);
        return DriverManager.getConnection(url, uname, pass);
    }
}
