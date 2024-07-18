package com.grayMatter;

public class DemoOnOuter {
	
	public static void main(String[] args) {
		OuterClass.Inner o = new OuterClass.Inner();
		
		System.out.println(o.name);
	}

}