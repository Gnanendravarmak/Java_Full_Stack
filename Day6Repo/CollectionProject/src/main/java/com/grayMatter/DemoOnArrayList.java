package com.grayMatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoOnArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List<Employees> emp = new ArrayList<>();
		
		Employees e1 = new Employees(23,"varma",500,"Hyderabad");
		Employees e2 = new Employees(22,"k1",8000,"Guntur");
		Employees e3 = new Employees(11,"v2",4000,"Delhi");
		
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(new Employees(22,"k1",1800,"Guntur"));
		
		
		System.out.println(emp);
		
		for(Employees em: emp) {
			System.out.println(em);
		}
		
		Iterator<Employees> itr = emp.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Sort Elements");
		
		Collections.sort(emp);
		
		System.out.println(emp);
		
		
		emp.sort(new CityComparator()
				.thenComparing(new NameComparator()).
				thenComparing(new SalaryComparator()));
		
		System.out.println(emp);
		
		
		for(Employees em: emp) {
			System.out.println(em);
		}


	}

}
