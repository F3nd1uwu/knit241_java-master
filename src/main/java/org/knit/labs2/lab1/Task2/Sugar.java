package org.knit.labs2.lab1.Task2;

public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 15.00;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", сахар";
    }

    @Override
    public double getCalories() {
        return super.getCalories() + 4.00;
    }
}
