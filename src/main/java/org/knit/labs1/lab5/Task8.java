package org.knit.labs1.lab5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Task8 {
    public static void execute() {
        String[] names = {"книга", "ручка", "линейка", "пенал"};
        Random random = new Random();
        ShopItem[] items = new ShopItem[100];

        // Генерация товарных позиций
        for (int i = 0; i < items.length; i++) {
            String name = names[random.nextInt(names.length)];
            int price = random.nextInt(10) * 100; // случайная цена от 0 до 100
            int quantity = random.nextInt(10) + 1; // случайное количество от 1 до 10
            items[i] = new ShopItem(name, price, quantity);
        }

        // Сортировка по имени
        Arrays.sort(items, Comparator.comparing(ShopItem::getName).thenComparing(ShopItem::getPrice));

        // Вывод объектов в консоль
        for (ShopItem item : items) {
            System.out.println(item);
        }

        // Подсчет количества одинаковых ShopItem
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[i].equals(items[j])) {
                    count++;
                    break; // Учитываем только одно совпадение для одного элемента
                }
            }
        }

        System.out.println("Количество одинаковых ShopItem: " + count);
    }
}
