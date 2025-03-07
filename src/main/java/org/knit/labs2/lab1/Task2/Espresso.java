package org.knit.labs2.lab1.Task2;

public class Espresso implements Coffee {
    @Override
    public double getCost() {
        return 100.00;
    }

    @Override
    public String getDescription() {
        return "Кофе Эспрессо";
    }

    @Override
    public double getCalories() {
        return 9.00;
    }
}
