package com.grayMatter;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeoOnstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr[] = new Integer[] {1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4,5,6};
		
		List<Integer> list = Arrays.stream(arr)
		.limit(4)
		.filter(i->i%2==0)
		.map(i->i+10)
//		.forEach(System.out::print);
		.collect(Collectors.toList());
		
//		List<Integer> ll = new ArrayList<>(Arrays.asList(3,4,5,6,7,8,9));
		
		
		List<Integer> ll = new ArrayList<>(Arrays.asList(22,55,11,7,2));
		
		System.out.println(ll.stream().reduce(0, (a,b)->(a+b)));
		
		ll.stream()
        .distinct()
        .forEach(num -> {
              System.out.println(num);
        });
		
		List<String>  str= new ArrayList<>(Arrays.asList("hello","world","hai","varma","apple"));
		
		str.stream().filter(name -> name.endsWith("e")).map(e->e.toUpperCase()).forEach(num->{
			System.out.println(num);
		});
		
		
		str.stream().sorted();
		
		
		
		System.out.println(ll.stream().reduce(1,(a,b)->(a*b)));
		
		
		str.stream().filter(e->e.length() >5).map(s->s.toUpperCase()).forEach(System.out::print);
		
		
		System.out.println(ll.stream().min(Integer::compareTo).orElseGet(null));
		
		System.out.println(ll.stream().max(Integer::compare));
		
		
		
		
		System.out.println(ll.stream().sorted().skip(1).findFirst().get());
		
		
		System.out.println(ll.stream().sorted().skip(ll.size()-2).findFirst().get());
		
//		System.out.println(ll.stream().unordered().skip(2).max(Integer::compare).get());
		
		
		List<String>  s1 = new ArrayList<>(Arrays.asList("hello","world","hai","varma","apple"));
		
		
		System.out.println();

	}

}
