package com.leonardotx;

import java.util.Arrays;

public class CarDealership {
    private String name;
    private int maxCarsToDisplay;
    private Car[] carsInStock;

    public CarDealership(String name, int maxCarsOnDisplay) {
        this.name = name;
        this.maxCarsToDisplay = maxCarsOnDisplay;
        this.carsInStock = new Car[maxCarsOnDisplay];
    }

    public String getName() {
        return name;
    }

    public int getMaxCarsToDisplay() {
        return maxCarsToDisplay;
    }

    public Car[] getCarsInStock() {
        return carsInStock;
    }

    public void addCarToStock(Car car) {
        int currentStockSize = getCarInStockCount();

        if (currentStockSize < maxCarsToDisplay) {
            carsInStock[currentStockSize] = car;
            System.out.println(car.getManufacturer() + " " + car.getEngineType() + " car added in stock.");
        } else {
            System.out.println("The maximum capacity of cars on display has been reached.");
        }
    }

    private int getCarInStockCount() {
        int count = 0;

        for (Car car : carsInStock) {
            if (car != null) {
                count++;
            }
        }

        return count;
    }

    public Car findCarByManufacturer(String manufacturer) {
        Car carMatch = null;
        for (Car car : carsInStock) {
            if (car != null && car.getManufacturer().equalsIgnoreCase(manufacturer)) {
                carMatch = car;
                break;
            }
        }

        return carMatch;
    }

    @Override
    public String toString() {
        return "CarDealership{" +
                "name='" + name + '\'' +
                ", maxDisplay=" + maxCarsToDisplay +
                ", carsInStock=" + Arrays.toString(carsInStock) +
                '}';
    }
}
