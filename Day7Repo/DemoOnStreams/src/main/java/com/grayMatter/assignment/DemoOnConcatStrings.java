package com.grayMatter.assignment;

import java.util.Arrays;
import java.util.stream.Stream;

public class DemoOnConcatStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello";
		
		String str2 = "World";
		
		String str = Stream.concat(Stream.of(str1), Stream.of(str2)).reduce((a,b)->a+" "+b).orElse("UnAble to concat two Strings!!");
		
		System.out.println(str);
		

	}

}
