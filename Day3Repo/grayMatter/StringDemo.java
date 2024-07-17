package com.grayMatter;

import java.util.Arrays;

public class StringDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello";
		
		System.out.println(str.hashCode());
		
		String str1 = "		Hello	";
		
		System.out.println(str.hashCode());
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println(str+" world");
		
		
		System.out.println(str.concat(" call"));
		
		System.out.println(str.equals(str1));
		
		System.out.println(str1.length());
		
		System.out.println(str1.trim().length());
		
		System.out.println(str.lastIndexOf(3));
		
		System.out.println(str.replace('H', 'C'));
		
		str = "hello";
		
		System.out.println(str.compareTo(str1));
		
		
		System.out.println(str.indexOf("Hello1"));
		
		
		
		
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("Hello");
		
		System.out.println(sb.toString());
		
		System.out.println(sb.capacity());
		
		System.out.print(sb.replace(1,4,"kill"));
		
		System.out.println();
		
		System.out.println(sb.repeat("Hii", 3));
		
		
		
		String string[] = {"snake","skill","snap","sketch","varma"};
		
		for(String ss:string) {
			if(ss.startsWith("s")) System.out.println(ss);
		}
		
		
		String para = "Hello this is Graymatter company";
		
		String ss[] = para.split(" ");
		
		System.out.println(Arrays.toString(ss));
		
		String name = null;
		
		for(String s:ss) {
			
			name=String.join(" ", ss);
			
		}
		
		System.out.println(name);
		
		
		

	}

}
