package com.grayMatter;


public class App
{
    public static void main( String[] args )
    {
    	
        DemoInterface info = ()-> System.out.println("creating Method !!");		
        info.createMethod();
        
        PrintName pri = name -> System.out.println("printing Name: "+ name);
        pri.printName("varma");
        
        Addition ad = (a,b) -> a + b;
        System.out.println(ad.add(10, 20));
        
        Display dd = () -> System.out.println("Displaying Data");
        dd.display();

    }
}
