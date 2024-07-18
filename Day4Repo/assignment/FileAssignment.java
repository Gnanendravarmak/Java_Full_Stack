package com.grayMatter.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileAssignment {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("demo.txt");

        String paragraph = "This is a simple paragraph. It serves as a sample text for the file operations.";
        writeToFile(file, paragraph);

        String content = readFileContent(file);
        if (content != null) {
            int charCount = countCharacters(content);
            int wordCount = countWords(content);
            int lineCount = countLines(content);
            
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

          
            String modifiedContent = replaceCharacter(content, 's', '*');
            writeToFile(file, modifiedContent);

            System.out.println("Modified content written to the file.");
        }
    }

    public static void writeToFile(File file, String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(data);
            System.out.println("Data successfully written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFileContent(File file) throws FileNotFoundException {
        StringBuilder content = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(file));
        try  {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return content.toString();
    }

    public static int countCharacters(String content) {
        return content.length();
    }

    public static int countWords(String content) {
        String[] words = content.split("\\s+");
        return words.length;
    }

    public static int countLines(String content) {
        String[] lines = content.split("\n");
        return lines.length;
    }

    public static String replaceCharacter(String content, char oldChar, char newChar) {
        return content.replace(oldChar, newChar);
    }
}
