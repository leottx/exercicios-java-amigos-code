package com.leonardotx;

import java.math.BigDecimal;

public class Car {
    private String manufacture;
    private BigDecimal price;
    private String engineType;

    public Car(String manufacture, BigDecimal price, String engineType) {
        this.manufacture = manufacture;
        this.price = price;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacture='" + manufacture + '\'' +
                ", price=" + price +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
