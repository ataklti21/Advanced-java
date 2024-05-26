package com.atuka.StaticMethods;
import org.w3c.dom.ls.LSOutput;

import  java.lang.Math.*;
public class MainClass {
    public static void main(String[] args) {
        Person person1 = new Person("Ataklti", "myemail@gmail.com", "Phone Number");
        Person person2 = new Person("Senait", "email@gmail.com", "091234565");
        Person.printPersonCounter();
        Temperature t1 = new Temperature(75);
        Temperature t2 = new Temperature(100);
        Temperature t3 = new Temperature(65);
        // Temperature temperature = new Temperature(200);
        System.out.println("The max temperature is " + Temperature.maxTem);
        Person.printPersonCounter();
        StaticVariableInit staticvariable = new StaticVariableInit();
        staticvariable.displayExpirationYear();
        GradeStudent s1 = new GradeStudent();
        System.out.println(s1.getInfo());

        int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for (int i : my_array) {
            if (i%3 == 0) {
                sum += i;
            }

        }
        System.out.println("The sum is " + sum);
        System.out.println(Math.PI);
    }


}
