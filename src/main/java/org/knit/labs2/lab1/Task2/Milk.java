package org.knit.labs2.lab1.Task2;

public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 25.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", молоко";
    }

    @Override
    public double getCalories() {
        return super.getCalories() + 2.00;
    }
}
