package com.grayMatter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOnBytesStreams {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file = new FileOutputStream("data.txt");
		
		String s = "Hello world";
		
		file.write(s.getBytes());
		
		
		FileInputStream fi =new FileInputStream("data.txt");
		
		
		
		int ch;
        StringBuffer content = new StringBuffer();

        while ((ch = fi.read()) != -1) {
            content.append((char) ch);
        }

        System.out.println("File content:");
        System.out.println(content.toString());
        
        
        fi.close();
        
        file.close();
		
		
		
		
		
		
		

	}

}
