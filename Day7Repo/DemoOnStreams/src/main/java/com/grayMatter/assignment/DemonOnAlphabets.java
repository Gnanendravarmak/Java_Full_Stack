package com.grayMatter.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemonOnAlphabets {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("varma","hello","world","order","kiran");
		
		
		str.stream().sorted().forEach((s) -> System.out.println(s));

	}

}
