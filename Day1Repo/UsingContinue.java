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
        
        
        
        int num1 = 5;
        int num2 = 10;
        int num3 = 7;
        int num4 = 3;
        int num5 = 9;
        
 
        int num6 = (num1 > num2) ? ((num1 > num3) ? ((num1 > num4) ? ((num1 > num5) ? num1 : num5) : ((num4 > num5) ? num4 : num5)) : ((num3 > num4) ? ((num3 > num5) ? num3 : num5) : ((num4 > num5) ? num4 : num5)))
                                : ((num2 > num3) ? ((num2 > num4) ? ((num2 > num5) ? num2 : num5) : ((num4 > num5) ? num4 : num5)) : ((num3 > num4) ? ((num3 > num5) ? num3 : num5) : ((num4 > num5) ? num4 : num5)));
        
        
        System.out.println(num6);
        
        
        
        int maxVal;
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
        	maxVal = num1;
        } else if (num2 > num3 && num2 > num4 && num2 > num5) {
        	maxVal = num2;
        } else if (num3 > num4 && num3 > num5) {
        	maxVal = num3;
        } else if (num4 > num5) {
        	maxVal = num4;
        } else {
        	maxVal = num5;
        }
        
      
        System.out.println(maxVal);

	}

}
