package com.atuka;

public class Employee {
    private String name;
    private double salary;
    private static Integer counter;

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public static Integer getCounter() {
        return counter;
    }

    public static void setCounter(Integer counter) {
        Employee.counter = counter;
    }

    public String getName() {
        return name;
    }
}
