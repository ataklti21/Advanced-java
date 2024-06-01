package fundamentals;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class JavaFundamentals {


    public static void main(String[] args) {

        int[][] multiplicationTable = new int[12][12];
        //Multiplication Table Multidimensional Array
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {

                multiplicationTable[i - 1][j - 1] = i * j;
                System.out.print(multiplicationTable[i - 1][j - 1] + "\t");
            }
            System.out.println();
        }
        //Displaying Multidimensional Array
        System.out.println("Displaying Multidimensional Array using for loop");
        for (int i = 0; i < 12; i++) {
            for (int j = 1; j < 12; j++) {
                System.out.print(multiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Displaying Multidimensional Array using deepToString");
        System.out.println(Arrays.deepToString(multiplicationTable));
        //Casting and type conversion
        //Implicit casting or automatic casting
        //byte -> shor -> int -> long -> float -> double

        short x = 2;
        int y = x + 4;
        //using casting from large size to small use explicit casting
        //possibly loss of data
        float z = 1.1F;
        int d = (int) z + y;
        //performing Mathematical calculations using Maths class
        int round = Math.round(2.5F);
        System.out.println(round);
        //using celling returns the smallest integer greater then the parameter value
        int ceiled = (int) Math.ceil(4.5F);
        System.out.println(ceiled);
        // the floor returns the smaller integer value
        double floored = Math.floor(3.2F);
        System.out.println(floored);
        //Generating Random Number between 1 and 100
        int random = (int) (Math.random() * 100);
        System.out.println(random);
//Formating a number
        //Using Method Chaining
        //Accepting input value that has to be formated
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Integer number");

        float value = scanner.nextFloat();
        value = value / 100;
        String result = NumberFormat.getPercentInstance().format(value);
        System.out.println(result);
    }
}
