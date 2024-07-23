package com.grayMatter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DemoEmployeeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Employee emp = new Employee();
		
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(1, 100000, "Kiran"));
		emp.add(new Employee(2, 50000, "kishore"));
		emp.add(new Employee(3, 60000, "A1"));
		emp.add(new Employee(4, 70000, "kumar"));
		emp.add(new Employee(5, 10000, "hari"));
		emp.add(new Employee(6, 20000, "Ganesh"));
		emp.add(new Employee(7, 30000, "Gowtham"));
		emp.add(new Employee(8, 90000, "likith"));
		emp.add(new Employee(9, 50000, "pavan"));
		emp.add(new Employee(10, 50000, "ashok"));
		
		System.out.println("Before");
		for(Employee ee: emp) {
			System.out.println(ee.getId()+"  "+ee.getName()+" "+ee.getSalary());
		}
		
		
		Predicate<Integer> pre = (num)->(num > 50000);
		
		int i=0;
		for(Employee em: emp) {
			if (pre.test(em.getSalary())) {
                em.setSalary(em.getSalary() + 5000);
                emp.set(i, em); 
			}else {
				em.setSalary(em.getSalary() + 2000);
                emp.set(i, em);
			}
			i++;
		}
		
		
		
		System.out.println("After");
		
		
		for(Employee ee: emp) {
			System.out.println(ee.getId()+"  "+ee.getName()+" "+ee.getSalary());
		}

	}

}
