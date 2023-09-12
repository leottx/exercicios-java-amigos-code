package com.leonardotx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your monthly income: ");
        double monthlyIncome = sc.nextDouble();
        System.out.print("Enter the property value: ");
        double propertyValue = sc.nextDouble();

        System.out.println("Your anual rental yield is: " + calcAnualRentalYield(monthlyIncome, propertyValue));
    }

    public static String calcAnualRentalYield(double monthlyIncome, double propertyValue) {
        double anualRentalIncome = monthlyIncome * 12;
        double anualRentalYield = (anualRentalIncome / propertyValue) * 100;

        return String.format("%.2f%%", anualRentalYield);
    }
}