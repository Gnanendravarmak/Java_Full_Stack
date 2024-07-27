package com.grayMatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App<T> {
	T a;
	T b;
	
//	public <T> T add(T a, T b) {
//		System.out.println(a+b);
//		return a+b;
//	}
	
	public static <T> void print(T data) {
		
		System.out.println(data);
	}
	
    public static void main( String[] args )
    {
        App<String> app = new App<>();
//        app.add("Hello");
        
       
        
        
        List<String> list = Arrays.asList("Hello", "World", "Java", "insert", "delete");
        
        
        for(String ss: list) {
        	print(ss);
        }
        
        
        List<Integer> ilist = Arrays.asList(1, 2, 3, 4, 5);
        
        for(int val: ilist) {
        	print(val);
        }
        
        
    }
}
