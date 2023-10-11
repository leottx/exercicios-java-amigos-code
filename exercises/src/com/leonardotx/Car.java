package com.leonardotx;

public class Car implements Vehicle {
    private double currentSpeed;

    public Car() {
        currentSpeed = 0;
    }

    @Override
    public void move(double amount) {
        currentSpeed += amount;
        System.out.println("Car current speed: " + currentSpeed);
    }

    @Override
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void applyBreaks(double amount) {
        currentSpeed -= amount;
        System.out.println("Car current speed: " + currentSpeed);
    }
}
