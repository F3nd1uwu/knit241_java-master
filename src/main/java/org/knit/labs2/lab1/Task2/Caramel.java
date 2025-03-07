package org.knit.labs2.lab1.Task2;

public class Caramel extends CoffeeDecorator {
    public Caramel(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 50.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", карамель";
    }

    @Override
    public double getCalories() {
        return super.getCalories() + 2.00;
    }
}
