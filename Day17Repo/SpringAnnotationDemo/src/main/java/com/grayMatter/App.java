package com.grayMatter;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.grayMatter.dbConnection.DbClassUtils;
import com.grayMatter.dbConnection.DbConnection;
import com.grayMatter.dbConnection.MyConnectin;
//import com.grayMatter.dbConnection.MyConnectin;
import com.grayMatter.dbConnection.Regions;

public class App {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConnectin.class);

        Connection con = null;
        DbConnection dbConn = (DbConnection) context.getBean("dbConnection");
        System.out.println(dbConn);

        try {
            con = dbConn.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }

        DbClassUtils dbUtil = context.getBean(DbClassUtils.class);
        dbUtil.setConn(con);

        List<Regions> allData = dbUtil.getAll();
        for (Regions r : allData) {
            System.out.println(r.getId() + "  " + r.getName());
        }

        dbUtil.addRegion(new Regions(101, "Ind"));
        System.out.println(dbUtil.update(new Regions(101, "bha")));
        dbUtil.deleteRegion(1);
    }
}
