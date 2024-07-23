package com.grayMatter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DemoOnPersionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persion persion = new Persion();
		
		List<Persion> list = new ArrayList<>();
		
		
		list.add(new Persion("varma", 21, "23/11/2002"));
		list.add(new Persion("avinash", 45, "23/11/2002"));
		list.add(new Persion("ashok", 55, "2/1/1902"));
		list.add(new Persion("akash", 75, "2/1/1925"));
		
		
		Predicate<Integer> predicate = (num)->(num>35);
		
		for(Persion per: list) {
			String name = per.getName().toLowerCase();
			if(predicate.test(per.getAge())&& name.startsWith("a")) {
				System.out.println(per.getAge()+" "+ per.getName()+" "+per.getDob());
			}
		}
		
		
		
		
		
		
		

	}

}
