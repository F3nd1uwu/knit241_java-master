package org.knit.labs1.lab2;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Ошибка: Деление на ноль невозможно.");
        }
        return a / b;
    }
}