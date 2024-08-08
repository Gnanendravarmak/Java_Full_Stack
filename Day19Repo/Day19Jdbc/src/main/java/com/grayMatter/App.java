package com.grayMatter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.RowMapper;

import com.grayMatter.dao.EmployeeDao;
import com.grayMatter.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-bean.xml");
        EmployeeDao dao = (EmployeeDao) context.getBean("empdao");
        
        dao.addEmployee(new Employee("4", "varmak", "899900"));
        
        System.out.println("data added");
        
        List<Employee> empList = dao.getAllEmployees();
        
        for(Employee emp:empList) {
        	System.out.println(emp);
        }
        
        
        dao.updateEmployee(new Employee("1","kiran","1000"));
        
        System.out.println(dao.daleteEmployee("1"));
        
List<Employee> empList1 = dao.getAllEmployees();
        
        for(Employee emp:empList1) {
        	System.out.println(emp);
        }
        
        
        
        
        
        
    }
}
