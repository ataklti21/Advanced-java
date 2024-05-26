package com.atuka.StaticMethods;

public class Student {
    public String getFood() {
        return "Pizza";
    }
    public String getInfo()  {
        return this.getFood();
    }
}
