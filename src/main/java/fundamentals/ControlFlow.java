package fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number- ");
        int number = scanner.nextInt();
        //If else Statement to check a value is
        //Fuzz buzz fuzz-buzz
        //or not
        if (number % 5 == 0) {
            if (number % 3 == 0) {
                System.out.println("FuzzBuzz");
            } else {
                System.out.println("Fuzz");
            }
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
        Scanner scannerInput = new Scanner(System.in);
        String input = "";
        //Using while loop
        while (!input.equals("quit")) {
            System.out.print("Input- ");
            input = scannerInput.next().toLowerCase();
            System.out.println(input);
        }
        //Using do while
        do {
            System.out.print("Input- ");
            input = scannerInput.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
        //Using for each to iterate over an array
        String[] animals = {"cat", "dog", "cow", "goat", "ox"};

        //Displaying the values using for each
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}

