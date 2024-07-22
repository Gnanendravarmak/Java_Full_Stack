package com.grayMatter.linkedHashSet;


import java.util.LinkedHashSet;

public class DemoOnLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Employee> employees = new LinkedHashSet<>();

        employees.add(new Employee(1, "Amar", "HR"));
        employees.add(new Employee(2, "varma", "Engineering"));
        employees.add(new Employee(3, "Kiran", "Finance"));
        employees.add(new Employee(4, "Ashok", "Marketing"));

        System.out.println("All Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }


        employees.add(new Employee(1, "kishore", "HR"));


        System.out.println("All Employees Details: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }


        employees.remove(new Employee(2, "varma", "Engineering"));

        
        System.out.println("Employees after removal:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

     
        System.out.println("Checking if employee exists: " + employees.contains(new Employee(3, "Kiran", "Finance")));

        employees.clear();
        System.out.println("Employees after clearing the set:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

