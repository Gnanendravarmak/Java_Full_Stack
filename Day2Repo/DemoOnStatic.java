package com.grayMatter;



public class DemoOnStatic {
	
	static {
		System.out.println("static block-1");
	}
	
	static {
		System.out.println("static block-2");
	}
	
	static {
		System.out.println("static block-3");
	}
	
	public static void sayHello() {
		System.out.println("sayHello...");
	}

	public static void main(String[] args) {
		
		
		System.out.println("In main method");
		sayHello();
		main();
		main1();

	}
	
	public static final void main1() {
		System.out.println("Final static Block !!");
		
			}
	
	public static void main() {
		System.out.println("without argument");
	}
	
	static {
		System.out.println("static block-4");
	}

}

