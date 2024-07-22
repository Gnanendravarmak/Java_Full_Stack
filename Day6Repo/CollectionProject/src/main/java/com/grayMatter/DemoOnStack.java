package com.grayMatter;

import java.util.Stack;

public class DemoOnStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println(stack.capacity());

	}

}
