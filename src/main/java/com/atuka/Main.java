package com.atuka;
//this is A design pattern example

import com.atuka.taxcalculator.Calculate2019;
import com.atuka.taxcalculator.TaxCalculator;

/**
 * design pattern concern with instantiate
 * of objects
 * singleton Design pattern
 * factory Design patter
 * Builder
 * Abstract
 * prototype design pattern
 * Practical code for all java parts
 */

public class Main {
    public static void main(String[] args) {
        TaxCalculator tax = getTax();
        tax.calculate();

        immutableClass immuClass = new immutableClass("Ataklti", 44);
        System.out.println(immuClass.getAge());
        int ageofBoy = immuClass.getAge() + 8;
        System.out.println(ageofBoy);

        System.out.println("Hello" + "this is test for mutability");

        Employee emp = new Employee();
        // emp.setSalary(10000);
        Manager manager = new Manager();
        manager.giveRandomRaise(emp);
        emp.raiseSalary(20);
        //   System.out.println("Salary" + emp.getSalary());
        Employee.setCounter(1);
    }

    public static TaxCalculator getTax() {
        return new Calculate2019();
    }
}