package org.knit.lab10;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Number>  {
    private List<T> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    // Метод для добавления элемента в контейнер
    public void add(T item) {
        items.add(item);
    }

    // Метод для вычисления суммы всех элементов
    public double sum() {
        double total = 0.0;
        for (T item : items) {
            total += item.doubleValue(); // Приводим к double для суммирования
        }
        return total;
    }

    public static void execute() {
        // Пример использования для Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.add(10);
        integerBox.add(20);
        System.out.println(integerBox.sum()); // Вывод: 30

        // Пример использования для Double
        Box<Double> doubleBox = new Box<>();
        doubleBox.add(1.5);
        doubleBox.add(2.5);
        System.out.println(doubleBox.sum()); // Вывод: 4.0
    }
}
