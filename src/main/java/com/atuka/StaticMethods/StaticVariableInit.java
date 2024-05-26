package com.atuka.StaticMethods;

import java.time.LocalDate;
import java.util.ArrayList;
//Static variables and methods and static initialization
//example
public class StaticVariableInit {
    private static final ArrayList<Integer> expirationYear = new ArrayList<>();

    //Static initialization
    static {
        int year = LocalDate.now().getYear();
        for (int i = 0; i < 10; i++) {
            expirationYear.add(i);
        }
    }
public void displayExpirationYear(){
    System.out.println(expirationYear);
}
}
