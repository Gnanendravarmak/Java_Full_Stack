package com.grayMatter.assignmnt;

public class Main {
    public static void main(String[] args) {
    	EmployeeArray[] employees = {
            new EmployeeArray("varma", 1, 85),
            new EmployeeArray("ravi", 2, 165),
            new EmployeeArray("sam", 3, 45),
        };

    	EmployeeArray maxNetSalaryEmployee = employees[0];

        for (EmployeeArray emp : employees) {
            System.out.println("Name: " + emp.getName() + ", ID: " + emp.getId() +
                               ", Salary: " + emp.getSalary() + ", Gross Salary: " + emp.getGrossSalary() +
                               ", Net Salary: " + emp.getNetSalary());

            if (emp.getNetSalary() > maxNetSalaryEmployee.getNetSalary()) {
                maxNetSalaryEmployee = emp;
            }
        }

        System.out.println("\nEmployee with Maximum Net Salary:");
        System.out.println("Name: " + maxNetSalaryEmployee.getName() + ", ID: " + maxNetSalaryEmployee.getId() +
                           ", Net Salary: " + maxNetSalaryEmployee.getNetSalary());
    }
}

