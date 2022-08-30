package org.example;

import java.util.ArrayList;
import java.util.List;
public class AutoFactory {
    private int autoCount;
    private List<Car> cars = new ArrayList<>();
    private ProductionLine productionLine;

    public AutoFactory(int autoCount, ProductionLine productionLine)
    {
        this.autoCount = autoCount;
        this.productionLine = productionLine;
    }

    public void Run()
    {
        int count = 0;
        while (count < autoCount)
        {
            cars.add(productionLine.Work());
            count++;
        }
    }
    public int CountCars()
    {
        return  cars.size();
    }
}
