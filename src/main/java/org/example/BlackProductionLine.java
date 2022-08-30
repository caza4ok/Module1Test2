package org.example;

public class BlackProductionLine implements ProductionLine{
    private static String color = "Black";
    @Override
    public Car Work() {
        return new Car(color);
    }
}
