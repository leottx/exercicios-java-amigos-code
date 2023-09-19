package com.leonardotx;

import java.math.BigDecimal;

public class Car {
    private String manufacture;
    private BigDecimal price;
    private EngineType engineType;

    public Car(String manufacture, BigDecimal price, EngineType engineType) {
        this.manufacture = manufacture;
        this.price = price;
        this.engineType = engineType;
    }

    public String getManufacture() {
        return manufacture;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public EngineType getEngineType() {
        return engineType;
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
