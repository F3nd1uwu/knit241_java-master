package org.knit.lab10;

public class Task19 {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Пусто :(");
        }

        T max = array[0]; // Инициализация максимального элемента
        for (T item : array) {
            if (item.compareTo(max) > 0) {
                max = item; // Обновление максимального элемента
            }
        }
        return max; // Возврат максимального элемента
    }

    public static void execute() {
        // Пример использования для массива Integer
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println(findMax(numbers)); // Вывод: 5

        // Пример использования для массива String
        String[] words = {"apple", "banana", "cherry"};
        System.out.println(findMax(words)); // Вывод: cherry
    }
}
