package com.grayMatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoOnLinkedList {

	public static void main(String[] args) {
		
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Orange");
		list.add("Banana");
		list.add("Apple");
		
		
		list.add("Orange");
		list.add("Banana");
		list.add("Apple");
		
		
		System.out.println(list);
		
		
		list.addFirst("Mango");
		list.addLast("Kiwi");
		
		System.out.println(list);
		
		
//		list.add(null);
		
		System.out.println(list);
		
		
		Iterator<String> itr = list.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		System.out.println(list.contains("Mango"));
		
		
		LinkedList<String> str = (LinkedList<String>) list.clone();
		
		
		System.out.println(str);
		
		
		System.out.println(str.hashCode());
		
		list.add("Hello");
		
		System.out.println(list.hashCode());
		
		
		System.out.println("data: "+list.peek());
		
		
		
		LinkedList<Employees> emp = new LinkedList<>();
		
		
		Employees e1 = new Employees(23,"varma",500,"Hyderabad");
		Employees e2 = new Employees(22,"k1",8000,"Guntur");
		Employees e3 = new Employees(11,"v2",4000,"Delhi");
		
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		
		LinkedList<Employees> listVal = (LinkedList<Employees>) emp.clone();
		
		
		System.out.println(listVal.hashCode());
		
//		emp.add(e3);
		
		System.out.println(emp.hashCode());
		

	}

}
