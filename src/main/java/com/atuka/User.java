package com.atuka;

public class User {
    //Fields(attributes)
    private String name;
private Integer age;
    public User(String name) {
        this.name = name;
    }
//Methods
    public void sayHello(){
        System.out.printf("Hi My name is %s",name);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
