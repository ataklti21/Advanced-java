package com.atuka.exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.logging.Logger;


public class ExercisesMain {
    public static void main(String[] args) {
        Exercises ex = new Exercises();
        Logger logger = Logger.getLogger("this is time and checking");
        ex.printCalender();
        Logger.getGlobal().info(()->"Calculating current date");
        System.out.println("Today-" + LocalDate.now());
        Logger.getGlobal().info("current date printed");
        Logger.getGlobal().info("Calculating current time");
        System.out.println("Time is-" + LocalTime.now());
        System.out.println("Date time -" + LocalDateTime.now());
        LocalDate date = LocalDate.of(2024, 9, 2);
        System.out.println(date);
        System.out.println(isSquRoot(16));
    }

    public static boolean isSquRoot(int n) {
        int sq = (int) Math.sqrt(n);
        int pow = (int) Math.pow(sq, 2);
       assert pow>=0;
        return n == pow;
    }

}
