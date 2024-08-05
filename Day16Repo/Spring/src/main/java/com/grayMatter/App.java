package com.grayMatter;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.grayMatter.beans.Customer;
import com.grayMatter.beans.DataConnection;
import com.grayMatter.beans.HelloBean;
import com.grayMatter.beans.Order;
import com.grayMatter.beans.Student;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        
//        HelloBean hb = new HelloBean();
//        
//        System.out.println(hb.sayHello());
        
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("hello-bean.xml");
//        HelloBean hb = (HelloBean)context.getBean("hello");
//        System.out.println(hb.sayHello());
        
//        HelloBean hb1 = (HelloBean)context.getBean("hello");
        
//        Order ord = (Order) context.getBean("ord");
        
//        Customer c = (Customer) context.getBean("cust");
        
        
//        Student s = (Student) context.getBean("stu");
//        
//        System.out.println(s.toString());
        
//        System.out.println(s.hashCode());
//        
//        
//        Student s1 = (Student) context.getBean("stu");
//        
//        System.out.println(s1.hashCode());
        
        
        
//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Db-bean.xml"));
        ApplicationContext factory = new ClassPathXmlApplicationContext("Db-bean.xml");
        
        DataConnection ds= (DataConnection) factory.getBean("dbCon");
        
        Connection conn=ds.getConnection();
        
        System.out.println(conn);
        
    }
}
