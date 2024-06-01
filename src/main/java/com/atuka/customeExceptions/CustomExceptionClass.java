package com.atuka.customeExceptions;

import java.util.Scanner;

public class CustomExceptionClass {
    public static void main(String[] args) {
        //Accessing Custom Exception
     final int AGE_LIMIT=18;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Age");
        int age = scanner.nextInt();
        boolean isAgeAbove18 = age >AGE_LIMIT;
        if (age < 0) {
            try {
                throw new CustomException("Age should be Greater than Zero");
            } catch (CustomException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
