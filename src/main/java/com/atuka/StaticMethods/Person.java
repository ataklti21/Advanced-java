package com.atuka.StaticMethods;

import static java.lang.Math.sqrt;

public class Person {
    private final String name;
    private final String email;
    private final String phoneNumber;

    //Declaring Static variable
    public static Integer personCounter = 0;

    public static void printPersonCounter() {

        System.out.println("Person Counter-" + personCounter);
        System.out.println(sqrt(20.0));
    }

    //None static Method can access static varibles
    public void noneStatic() {
        System.out.println(personCounter);
        printPersonCounter();
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", email='" + email + '\'' + ", phoneNumebr='" + phoneNumber + '\'' + '}';
    }

    public Person(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        personCounter++;
    }
    //factory Method that returns new instance is called factory Method
}
