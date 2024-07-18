package com.grayMatter;

public class CounterClass {
	
	int count =0;

	public synchronized void update() {
		
//		synchronized (this) {
			count++;
			printCont();
			
//		}
		// TODO Auto-generated method stub
		
	}

	private void printCont() {
		// TODO Auto-generated method stub
		
		System.out.println(count);
		
	}
	
	

}
