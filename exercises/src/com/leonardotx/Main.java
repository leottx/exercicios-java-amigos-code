package com.leonardotx;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        LocalDate myBirthDate = LocalDate.of(1996, Month.APRIL, 6);
        System.out.println("My birth date is: " + myBirthDate);
    }
}