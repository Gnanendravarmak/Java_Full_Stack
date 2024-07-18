package com.grayMatter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoOnFiles {

    public static void main(String[] args) throws IOException {
        File file = new File("demo11.txt");

        System.out.println("File Name: " + file.getName());
        System.out.println("File Path: " + file.getPath());
        System.out.println("Is Hidden: " + file.isHidden());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        
        FileWriter fw = new FileWriter(file);

        // Append data to the file
        String data = "This is the data to be appended to the file .\n";
        
        for(char c: data.toCharArray()) {
        	fw.write(c);
        }
        
        fw.close();
        
        FileReader fr = new FileReader(file);
        
        
        int ch;
        StringBuffer content = new StringBuffer();

        while ((ch = fr.read()) != -1) {
            content.append((char) ch);
        }

        System.out.println("File content:");
        System.out.println(content.toString());
        
        
        
        if(file.createNewFile()) {
        	System.out.println("Fie: "+file.createNewFile());
        }
        
        System.out.println("Fie: "+file.createNewFile());

        
        
    }

//    public static void appendToFile(File file, String data) {
//        try (FileWriter fw = new FileWriter(file, true);
//             BufferedWriter bw = new BufferedWriter(fw)) {
//
//            bw.write(data);
//            System.out.println("Data successfully appended to the file.");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
