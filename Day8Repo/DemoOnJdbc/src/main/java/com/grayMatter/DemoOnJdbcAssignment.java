package com.grayMatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DemoOnJdbcAssignment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/assignment";
		String userName = "root";
		String password ="password";
		
		Connection conn =  DriverManager.getConnection(url, userName, password);
		
		Scanner scanner = new Scanner(System.in);
		
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("Menu:");
			System.out.println("1. Display Employee Data");
	        System.out.println("2. Insert Employee");
	        System.out.println("3. Update Employee");
	        System.out.println("4. Delete Employee");
	        System.out.println("5. Exit");
	        
	        
	        System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
            	case 1:
            		selectEmployees(conn);
            		break;
            	case 2:
                    insertEmployee(conn);
                    break;
                case 3:
                    updateEmployee(conn);
                    break;
                case 4:
                    deleteEmployee(conn);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);;
                default:
                    System.out.println("Invalid choice. Please try again."); 
            }
		}
	}
	
	
	
	private static void selectEmployees(Connection conn) throws SQLException {
        String query = "SELECT * FROM employees";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        
        if (!rs.isBeforeFirst()) {
            System.out.println("The table is empty.");
        } else {
        	System.out.println("ID | Name | Position |  Salary ");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String position = rs.getString("position");
                int salary = rs.getInt("salary");
                System.out.println(id+"    "+ name+"   "+ position+"   "+ salary);
            }
        }
	}
	private static void insertEmployee(Connection conn) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter Position: ");
        String position = scanner.next();
        System.out.print("Enter Salary: ");
        int salary = scanner.nextInt();

        String query = "insert into employees (id, name, position, salary) value (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.setString(2, name);
        stmt.setString(3, position);
        stmt.setInt(4, salary);
        stmt.executeUpdate();
        System.out.println("Employee inserted successfully.");
    }

    private static void updateEmployee(Connection conn) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID to update: ");
        int id = scanner.nextInt();
        System.out.print("Enter new Name: ");
        String name = scanner.next();
        System.out.print("Enter new Position: ");
        String position = scanner.next();
        System.out.print("Enter new Salary: ");
        int salary = scanner.nextInt();

        String query = "update employees SET name = ?, position = ?, salary = ? WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setString(2, position);
        stmt.setInt(3, salary);
        stmt.setInt(4, id);
        stmt.executeUpdate();
        System.out.println("Employee updated successfully.");
    }

    private static void deleteEmployee(Connection conn) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID to delete: ");
        int id = scanner.nextInt();

        String query = "delete from employees where id = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        System.out.println("Employee deleted successfully.");
    }
    
    
}
