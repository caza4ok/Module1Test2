package org.example;

public class WhiteProductionLine implements ProductionLine {
    private static String color = "White";
    @Override
    public Car Work() {
        return new Car(color);
    }
}
