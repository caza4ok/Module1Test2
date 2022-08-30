package org.example;

import java.util.Random;

public class WhiteProductionLine implements ProductionLine {
    private static String color = "White";
    @Override
    public Car Work() {
        Random rnd = new Random();
        return new Car(color, rnd.nextBoolean());
    }
}
