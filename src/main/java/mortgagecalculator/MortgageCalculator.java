package mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENTAGE = 100;
        double principal;
        double annualRate;
        int years;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the following Values");
        System.out.print("Principal: ");
        principal = scanner.nextDouble();
        System.out.print("Annual Interest Rate: ");
        annualRate = scanner.nextDouble();
        double monthlyInterestRate = annualRate / PERCENTAGE / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        years = scanner.nextInt();
        int numberOfPayments = MONTHS_IN_YEAR * years;
        double mortgage = principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
        String mortgageFormated = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage Value: " + mortgageFormated);
    }
}
