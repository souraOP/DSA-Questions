package com.souraop;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte Months_In_Year = 12;
        final byte Percent = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        int principal = scanner.nextInt();

        System.out.print("Enter Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterestRate = (annualInterest / Percent) / Months_In_Year;

        System.out.print("Enter the number of years: ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * Months_In_Year;

        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1;

        System.out.println("Mortgage : " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
