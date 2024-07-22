package com.grayMatter;

import java.util.*;

public class DemoOnSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<>();
		
		set.add(23);
		set.add(34);
		set.add(null);
		
		System.out.println(set);
		
		@SuppressWarnings("unchecked")
		HashSet<Integer> hs = (HashSet<Integer>) ((HashSet<Integer>) set).clone();
		
		System.out.println(hs);
		
		Object arr[]=hs.toArray();
		
		System.out.println(Arrays.toString(arr));
		
		
		TreeSet<Integer> tree = new TreeSet<>();
		
		tree.add(90);
//		tree.add(null);
		tree.add(30);
		tree.add(70);
		tree.add(10);
		tree.add(40);
		tree.add(90);
		
		
		System.out.println(tree);
		
		Iterator<Integer> itr = tree.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		TreeSet<Employees> emp = new TreeSet<Employees>();
		
		emp.add(new Employees(23,"varma",500,"Hyderabad"));
		emp.add(new Employees(22,"Hello",8000,"Guntur"));
		emp.add(new Employees(11,"World",4000,"Delhi"));
		
		
		for(Employees em : emp) {
			System.out.println(em);
		}
		
		
		System.out.println(emp);
		
		
		System.out.println(tree.headSet(40));
		
		Iterator<Integer> it =tree.descendingIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
