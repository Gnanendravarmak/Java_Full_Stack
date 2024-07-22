package com.grayMatter;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoOnVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Integer> vector = new Vector<>();
		
		System.out.println(vector.capacity());
		
		
		for(int i=1;i<=13;i++) {
			vector.add(i);
		}
		
		System.out.println(vector.capacity());
		
		Iterator<Integer> it = vector.listIterator();
		
		System.out.println("using Iterator");
		while(it.hasNext()) {
			int i = it.next();
			
			if(i==6)
				it.remove();
			System.out.println(i);
		}
		
		System.out.println("using Enum Iterator");
		
		Enumeration<Integer>enu=vector.elements();
		
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
		Collections.sort(vector);
		Collections.reverse(vector);
		
		
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
		while(it.hasNext()) {
			int i = it.next();
			
			System.out.println(i);
		}
		
		System.out.println(vector.contains(0));
		System.out.println(vector.contains(5));
		
		
		System.out.println(vector.indexOf(7));
		
		
		System.out.println(vector.lastIndexOf(9));

	}

}
