package com.leonardotx;

public class ElectricScooter implements Vehicle {
    private double currentSpeed;

    @Override
    public void move(double amount) {
        currentSpeed += amount;
        System.out.println("Electric scooter current speed: " + currentSpeed);
    }

    @Override
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void applyBreaks(double amount) {
        currentSpeed -= amount;
        System.out.println("Electric scooter current speed: " + currentSpeed);
    }
}
