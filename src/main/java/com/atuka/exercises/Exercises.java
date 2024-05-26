package com.atuka.exercises;

import org.w3c.dom.ls.LSOutput;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

/**
 * @author atuka
 * Change the calendar printing program and
 * starts the week on a Sunday
 */
public class Exercises {
Calendar calendar =  Calendar.getInstance();
public void  printCalender(){

    //After changing the Starting Date of the week
    Calendar calendar = Calendar.getInstance();
   calendar.setFirstDayOfWeek(Calendar.SUNDAY);
    for (int i = 0; i < 7; i++) {
        System.out.println(calendar.getFirstDayOfWeek()+i);
    }
    System.out.println(calendar.getTime());
}
}
