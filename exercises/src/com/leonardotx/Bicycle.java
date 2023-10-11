package com.leonardotx;

public class Bicycle implements Vehicle{
    private double currentSpeed;

    @Override
    public void move(double amount) {
        currentSpeed += amount;
        System.out.println("Bicycle current speed: " + currentSpeed);
    }

    @Override
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void applyBreaks(double amount) {
        currentSpeed -= amount;
        System.out.println("Bicycle current speed: " + currentSpeed);
    }
}
