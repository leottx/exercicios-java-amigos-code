package com.leonardotx;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Creating a car dealership with a maximum of 5 cars on display
        CarDealership dealership = new CarDealership("XYZ Auto", 5);

        // Adding cars to the dealership's stock
        dealership.addCarToStock(new Car("Toyota", new BigDecimal("25000.0"), EngineType.GASOLINE));
        dealership.addCarToStock(new Car("Tesla", new BigDecimal("75000.0"), EngineType.ELECTRIC));
        dealership.addCarToStock(new Car("Honda", new BigDecimal("28000.0"), EngineType.ETHANOL));
        dealership.addCarToStock(new Car("Ford", new BigDecimal("32000.0"), EngineType.DIESEL));
        dealership.addCarToStock(new Car("Nissan", new BigDecimal("22000.0"), EngineType.GASOLINE));
        dealership.addCarToStock(new Car("Chevrolet", new BigDecimal("30000.0"), EngineType.ELECTRIC));

        // Checking the cars currently in stock
        System.out.println("\nCars currently in stock at " + dealership.getName() + ":");
        Car[] carsInStock = dealership.getCarsInStock();
        for (Car car : carsInStock) {
            if (car != null) {
                System.out.println(car.getManufacturer() + " " + car.getEngineType());
            }
        }
    }
}