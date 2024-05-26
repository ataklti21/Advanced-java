package com.atuka.StaticMethods;

public class MainClass {
    public static void main(String[] args) {
        Person person1 = new Person("Ataklti", "myemail@gmail.com", "Phone Number");
        Person person2 = new Person("Senait", "email@gmail.com", "091234565");
        Person.printPersonCounter();
        Temperature t1 = new Temperature(75);
        Temperature t2 = new Temperature(100);
        Temperature t3 = new Temperature(65);
        // Temperature temperature = new Temperature(200);
        System.out.println("The max temperature is " + Temperature.maxTem);
        Person.printPersonCounter();
        StaticVariableInit staticvariable = new StaticVariableInit();
        staticvariable.displayExpirationYear();
        GradeStudent s1 = new GradeStudent();
        System.out.println(s1.getInfo());

        int[] my_array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;
        for (int i : my_array) {
            if (i % 3 == 0) {
                sum += i;
            }

        }
        System.out.println("The sum is " + sum);
        System.out.println(Math.PI);
        int increment = 4;
        StaticVariableInit.increment(increment);
        System.out.println("the value of increment is " + increment);
        int increment2 = 10;
        StaticVariableInit.increment(increment2);
        System.out.println(increment2);
        //Null object references practical
        // in this case time produce error that indicates
        //Variable 'p' might not have been initialized
        //This prevent to compile and run this code.
//        Person p; //= new Person("Name", "email", "phone");
//        p.noneStatic();
        //initializing object reference to null
        //In this case the Method invocation
        // to the 'noneStatic' Method
        // will produce 'NullPointerException'

//        Person pNullReference =null;
//        pNullReference.noneStatic();
    }
}
