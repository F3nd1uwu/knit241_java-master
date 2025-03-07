package org.knit.labs2.lab1.Task2;

public class Chocolate extends CoffeeDecorator {
    public Chocolate(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 50.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", шоколад";
    }

    @Override
    public double getCalories() {
        return super.getCalories() + 3.00;
    }
}
