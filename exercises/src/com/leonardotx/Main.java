package com.leonardotx;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime todayLocalDateTime = LocalDateTime.now();
        System.out.println("Today localDateTime: " + todayLocalDateTime);
        LocalDate todayLocalDate = LocalDate.now();
        System.out.println("Today localDate: " + todayLocalDate);
    }
}