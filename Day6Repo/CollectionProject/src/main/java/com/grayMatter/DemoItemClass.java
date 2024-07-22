package com.grayMatter;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoItemClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Item> item = new LinkedList<Item>();
		
		item.add(new Item(1,3000,"Book","Lenovo"));
		item.add(new Item(3,7000,"Laptop","Dell"));
		item.add(new Item(5,9000,"LapTop","Mac"));
		item.add(new Item(7,6000,"Mobile","One Plus"));
		
		Iterator<Item> itr = item.iterator();
		
		Collections.sort(item);
		
		
		
		item.sort(new ItemNameComparator().thenComparing(new ItemComparator()));
		
		System.out.println(item);
		
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
