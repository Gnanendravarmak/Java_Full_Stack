package com.grayMatter;

import java.util.*;

public class DemoOnCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		
		
		for(int i =1;i<=10;i++) {
			list.add(i);
		}
		
//		list.add(58);
		list.add("varma");
		list.add(true);
//		list.add(58);
		
		
		System.out.println(list);
		
		
		
		
		
		for(var vv:list) {
			System.out.println(vv);
		}
		
		
		
		List<Integer> alist = new ArrayList<Integer>();
		
		alist.add(10);
		alist.add(20);
		alist.add(30);
		
		for(int val:alist) {
			System.out.println(val);
		}
		
		alist.add(2,50);
		
		System.out.println(alist);
		
		
		
		alist.addAll(2,list);
		

		
		System.out.println(alist);
		
		
		
		System.out.println(alist.remove((Integer)50));
		
		alist.clear();
		
		
		System.out.println(alist);
		
		
		alist.add(10);
		alist.add(20);
		alist.add(30);
		
		System.out.println(alist);
		
		System.out.println("Using Iterator");
		
		Iterator<Integer> itr = alist.iterator();
		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		System.out.println("Using ListIterator");
		
		ListIterator<Integer> listitr = alist.listIterator();
		
		System.out.println("Displaying in farward Direction");
		
		while(listitr.hasNext()) {
			System.out.println(listitr.next());
		}
		
		
		System.out.println("Displaying in backward Direction");
		
		while(listitr.hasPrevious()) {
			System.out.println(listitr.previous());
		}
		
		Collections.sort(alist);
		
		System.out.println(alist);
		
		Collections.reverse(alist);
		
		System.out.println(alist);
		
		alist.remove(0);
		
		

	}

}
