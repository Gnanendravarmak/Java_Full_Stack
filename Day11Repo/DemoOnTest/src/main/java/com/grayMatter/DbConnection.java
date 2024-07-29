package com.grayMatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class DbConnection {

    private String uname;
    private String pwd;
    private String url;

    public DbConnection(String url, String uname, String pwd) {
        this.url = url;
        this.uname = uname;
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DbConnection that = (DbConnection) obj;
        return uname.equals(that.uname) && pwd.equals(that.pwd) && url.equals(that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uname, pwd, url);
    }

    public Connection checKb() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, uname, pwd);
    }
}
