package org.example;

import java.util.ArrayList;
import java.util.List;
public class AutoFactory {
    private int autoCount;
    private int factoryCount;
    private List<Car> cars = new ArrayList<>();
    private ProductionLine productionLine;

    public AutoFactory(int autoCount, ProductionLine productionLine)
    {
        this.autoCount = autoCount;
        this.productionLine = productionLine;
    }

    public void Run()
    {
        Car car;
        int count = 0;
        while (count < autoCount)
        {
            car = productionLine.Work();
            factoryCount++;
            if (car.isPartsDelivered())
            {
                cars.add(car);
                count++;
            }
        }
    }
    public int CountCars()
    {
        return  cars.size();
    }
    public int getFactoryCount() {
        return factoryCount;
    }
}
