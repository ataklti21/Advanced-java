package mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENTAGE = 100;
        final double MIN_PRINCIPAL = 1_000;
        final double MAX_PRINCIPAL = 1_000_000;
        final int MIN_ANNUAL_RATE = 0;
        final int MAX_ANNUAL_RATE = 30;
        double principal;
        double annualRate;
        int years;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the following Values");
        System.out.print("Principal ($1K-$1M): ");
        principal = scanner.nextDouble();
        //Checking the value of principal
        while (!(principal >= MIN_PRINCIPAL && principal <= MAX_PRINCIPAL)) {
            System.out.printf("Principal Must be between %8.2f and %10.3f", MIN_PRINCIPAL, MAX_PRINCIPAL);
            System.out.println();
            System.out.print("Enter Principal again ($1K-$1M): ");
            principal = scanner.nextDouble();
        }
//Checking annual rate

        System.out.print("Annual Interest Rate: ");
        annualRate = scanner.nextDouble();

        while (!(annualRate >= MIN_ANNUAL_RATE && annualRate <= MAX_ANNUAL_RATE)) {
            System.out.printf("Annual Rate Must be between %d and %d", MIN_ANNUAL_RATE, MAX_ANNUAL_RATE);
            System.out.println();
            System.out.print("Enter Annual Interest Rate Again (0-30): ");
            annualRate = scanner.nextDouble();
        }

        double monthlyInterestRate = annualRate / PERCENTAGE / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        years = scanner.nextInt();
        while (!(years >= 0)) {
            System.out.println("Period (Years): Must be Greater than 0 ");
            System.out.print("Enter A valid (Period Greater Than zero) Again: ");
            years = scanner.nextInt();
        }

        int numberOfPayments = MONTHS_IN_YEAR * years;
        double mortgage = principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        String mortgageFormated = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage Value: " + mortgageFormated);
    }
}
