package org.example;

import java.util.Random;

public class BlackProductionLine implements ProductionLine{
    private static String color = "Black";
    @Override
    public Car Work() {
        Random rnd = new Random();
        return new Car(color, rnd.nextBoolean());
    }
}
