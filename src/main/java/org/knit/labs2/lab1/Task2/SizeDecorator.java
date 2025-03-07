package org.knit.labs2.lab1.Task2;

public class SizeDecorator extends CoffeeDecorator {
    public String value;

    public SizeDecorator(Coffee coffee, String value) {
        super(coffee);
        this.value = value;
    }

    @Override
    public double getCost() {
        if (value.equals("low")) {
            return super.getCost();
        }
        if (value.equals("medium")) {
            return super.getCost() + 25.00;
        }
        if (value.equals("high")) {
            return super.getCost() + 50.00;
        }
        return super.getCost();
    }

    @Override
    public String getDescription() {
        if (value.equals("low")) {
            return super.getDescription() + ", маленький размер";
        }
        if (value.equals("medium")) {
            return super.getDescription() + ", средний размер";
        }
        if (value.equals("high")) {
            return super.getDescription() + ", большой размер";
        }
        return super.getDescription() + ", маленький размер";
    }

    @Override
    public double getCalories() {
        if (value.equals("low")) {
            return super.getCalories();
        }
        if (value.equals("medium")) {
            return super.getCalories() + 6;
        }
        if (value.equals("high")) {
            return super.getCalories() + 16;
        }
        return super.getCalories();
    }
}
