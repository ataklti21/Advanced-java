package com.atuka.exercises;

import java.util.Arrays;
import java.util.Calendar;

/**
 * @author atuka
 * Change the calendar printing program and
 * starts the week on a Sunday
 */
public class Exercises {
    Calendar calendar = Calendar.getInstance();

    public void printCalender() {

        //After changing the Starting Date of the week
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.SUNDAY);
        for (int i = 0; i < 7; i++) {
            System.out.println(calendar.getFirstDayOfWeek() + i);
        }
        System.out.println(calendar.getTime());
        String[] bugs = {"cricket", "beetle", "ladybug"};
        System.out.println(Arrays.toString(bugs));
        Arrays.sort(bugs);
        System.out.println(Arrays.toString(bugs));
        for (String str : bugs) {
            System.out.println(str);
        }

    }
}
