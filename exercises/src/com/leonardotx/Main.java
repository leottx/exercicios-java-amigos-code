package com.leonardotx;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate myBirthDate = LocalDate.of(1996, Month.SEPTEMBER, 14);
        System.out.println("My age is: " + calcAge(myBirthDate));
    }

    private static int calcAge(LocalDate birthDate) {
        Period period = Period.between(birthDate, LocalDate.now());

        // Get the years from the period
        int years = period.getYears();

        // Get the months from the period
        int months = period.getMonths();

        // Get the days from the period
        int days = period.getDays();

        // Adjust the age based on the months and days
        if (months < 0 || (months == 0 && days < 0)) {
            years--;
        }

        return years;
    }
}