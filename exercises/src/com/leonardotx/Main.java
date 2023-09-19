package com.leonardotx;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volkswagen", new BigDecimal("35000.00"), EngineType.GASOLINE);

        System.out.println("Manufacture: " + car.getManufacture());
        System.out.println("Price: $" + car.getPrice());
        System.out.println("Engine type: " + car.getEngineType());
    }
}