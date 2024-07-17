package com.grayMatter.assignmnt;



class EmployeeArray {
    private String name;
    private int id;
    private double salary;
    private double grossSalary;
    private double netSalary;

    public EmployeeArray(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        calculateSalaries();
    }

    private void calculateSalaries() {
        double hra, ta, a, it;
        
        if (salary >= 70) {
            hra = 0.15 * salary;
            ta = 0.10 * salary;
            a = 0.10 * salary;
            it = 0.11 * salary;
        } else if (salary >= 50) {
            hra = 0.13 * salary;
            ta = 0.08 * salary;
            a = 0.08 * salary;
            it = 0.09 * salary;
        } else if (salary >= 30) {
            hra = 0.10 * salary;
            ta = 0.07 * salary;
            a = 0.07 * salary;
            it = 0.08 * salary;
        } else {
            hra = ta = a = 0.0;
            it = 0.0;
        }

        grossSalary = salary + hra + ta + a;
        netSalary = grossSalary - it;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }
}
