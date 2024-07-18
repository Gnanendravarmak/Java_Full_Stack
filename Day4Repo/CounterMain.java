package com.grayMatter;

public class CounterMain extends Thread {
	
	CounterClass cl;
	
	

	public CounterMain(CounterClass cl) {
		super();
		this.cl = cl;
	}
	
	public CounterMain() {
		super();
		
	}

	
	public void run() {
		
		for(int i=0;i<10;i++) {
			
//			System.out.println("Id: "+currentThread().getId());
			cl.update();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		CounterClass cc = new CounterClass();
		CounterMain c1 = new CounterMain(cc);
		CounterMain c2 = new CounterMain(cc);
		
		c1.start();
		
		
		
		c2.start();
		
		

	}

}
