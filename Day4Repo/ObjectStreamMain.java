package com.grayMatter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ObjectStreamMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Customer c = new Customer("varma",1);
		
		FileOutputStream fis = new FileOutputStream("obj.txt");
		ObjectOutputStream ois = new ObjectOutputStream(fis);
		
		ois.writeObject(c);
		
		FileInputStream fi = new FileInputStream("obj.txt");
		ObjectInputStream obs = new ObjectInputStream(fi);
		Customer c1= (Customer) obs.readObject();
		
		System.out.println(c1);
		
		
		
		
		

	}

}
