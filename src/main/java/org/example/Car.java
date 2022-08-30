package org.example;

public class Car {
    private String color;
    private boolean partsDelivered;
    public Car(String color, boolean partsDelivered) {
        this.color = color;
        this.partsDelivered = partsDelivered;
    }
    public String getColor() {
        return color;
    }
    public boolean isPartsDelivered() {
        return partsDelivered;
    }
}
