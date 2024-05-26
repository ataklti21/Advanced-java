package com.atuka;

import java.util.Random;

public class Manager {
    private Random generator = new Random();

    public void giveRandomRaise(Employee e){
        double percent = 10* generator.nextDouble();
        e.raiseSalary(percent);
    }
}
