package com.leonardotx;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new ElectricScooter(), new Bicycle()};
        Person person = new Person("Leonardo", vehicles);

        for (Vehicle vehicle : person.getVehicles()) {
            vehicle.move(5);
        }
    }
}