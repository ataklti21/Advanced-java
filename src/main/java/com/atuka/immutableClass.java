package com.atuka;

public class immutableClass {
    private final String name;
    private final  int age;

    public immutableClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
