package com.leonardotx;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volkswagen", new BigDecimal("35000.00"), "electric");

        System.out.println(car);
    }
}