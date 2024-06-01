package com.atuka.customeExceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    public void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            reader.close();
        }
    }

    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        try {
            processor.readFile("example.txt");
        } catch (IOException e) {
            // Handle the IOException
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class FileProcessor {
//    public void readFile(String fileName) {
//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(new FileReader(fileName));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            // Handle the IOException
//            System.out.println("Error reading the file: " + e.getMessage());
//        } finally {
//            // Ensure the BufferedReader is closed
//            try {
//                if (reader != null) {
//                    reader.close();
//                }
//            } catch (IOException e) {
//                System.out.println("Error closing the file: " + e.getMessage());
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        FileProcessor processor = new FileProcessor();
//        processor.readFile("example.txt");
//    }
