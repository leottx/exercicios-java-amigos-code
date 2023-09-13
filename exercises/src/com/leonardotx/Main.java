package com.leonardotx;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        LocalDate myBirthDate = LocalDate.of(1996, Month.APRIL, 6);
        System.out.println("My age is: " + calcAge(myBirthDate));
    }

    private static int calcAge(LocalDate birthDate) {
        if (birthDate == null) {
            return -1;
        }

        return LocalDate.now().getYear() - birthDate.getYear();
    }
}