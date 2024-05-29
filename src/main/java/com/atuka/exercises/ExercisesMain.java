package com.atuka.exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.lang.Error;
public class ExercisesMain {
    public static void main(String[] args) {
        Exercises ex = new Exercises();
        ex.printCalender();
        System.out.println("Today-" + LocalDate.now());
        System.out.println("Time is-" + LocalTime.now());
        System.out.println("Date time -" + LocalDateTime.now());
        LocalDate date = LocalDate.of(2024, 9, 2);
        System.out.println(date);
        System.out.println(isSquRoot(16));
    }
    public  static  boolean isSquRoot(int n){
        int sq = (int)Math.sqrt(n);
        int pow = (int)Math.pow(sq,2);
        return n == pow;
    }
}
