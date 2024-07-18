package com.grayMatter.assignmnt;




public class AsbtractMainClass {
    public static void main(String[] args) {
        Customer customer = new Customer("varma", 101, "Gold");
        Employee employee = new Employee("Ravi", 102, "Silver");
        Admin admin = new Admin("kumar", 103, "Bronze");

        customer.getDetails();
        employee.getDetails();
        admin.getDetails();

        customer.setDetails("Gnanendra varma", 201);
        employee.setDetails("Hello varma", 202);
        admin.setDetails("Hello world", 203);

        customer.getDetails();
        employee.getDetails();
        admin.getDetails();
    }
}
