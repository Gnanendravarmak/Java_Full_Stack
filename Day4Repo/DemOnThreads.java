package com.grayMatter;

public class DemOnThreads extends Thread {
	
	public void run() {
		for(int i=0;i<6;i++) 
			System.out.println("Running child thread - "+i);
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println(currentThread().getName());
		
		System.out.println(currentThread().getPriority());
		
		
		
		
		System.out.println(currentThread().isAlive());
		
		System.out.println(currentThread().isDaemon());
		
		
		DemOnThreads dd = new DemOnThreads();
		
		dd.start();
		
//		Thread.sleep(1000);
		
		DemOnThreads dd1 = new DemOnThreads();
		
		dd1.start();
		
		
		System.out.println("main thread");
		
		
		
		

	}

}
