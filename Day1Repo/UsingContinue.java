package com.grayMatter;

public class UsingContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1;i<50;i++) {
			if(i % 3 == 0) continue;
			
			else System.out.println(i);
			
		}
		
		int a = 5;
        int b = 10;
        int c = 7;
        int d = 3;
        
        
        int e = (a > b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d))
                          : ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d));
        
        System.out.println(e);
        
        
        int max;
        if (a > b && a > c && a > d) {
            max = a;
        } else if (b > c && b > d) {
            max = b;
        } else if (c > d) {
            max = c;
        } else {
            max = d;
        }
        
        System.out.println(max);

	}

}
