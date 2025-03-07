package org.knit.labs1.lab10;

import java.util.Arrays;

public class Dictionary<K, V> {
    private K[] keys;
    private V[] values;
    private int size; // текущее количество элементов
    private int capacity; // максимальное количество элементов

    // Конструктор
    @SuppressWarnings("unchecked")
    public Dictionary(int capacity) {
        this.capacity = capacity;
        this.keys = (K[]) new Object[capacity]; // создание массива для ключей
        this.values = (V[]) new Object[capacity]; // создание массива для значений
        this.size = 0;
    }

    // Добавление элемента
    public void add(K key, V value) {
        if (size < capacity) {
            keys[size] = key;
            values[size] = value;
            size++;
        } else {
            System.out.println("Словарь заполнен.");
        }
    }

    // Получение элемента
    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (keys[i] != null && keys[i].equals(key)) {
                return values[i];
            }
        }
        return null; // если ключ не найден
    }

    // Удаление элемента
    public V remove(K key) {
        for (int i = 0; i < size; i++) {
            if (keys[i] != null && keys[i].equals(key)) {
                V value = values[i];
                // Сдвиг элементов влево
                for (int j = i; j < size - 1; j++) {
                    keys[j] = keys[j + 1];
                    values[j] = values[j + 1];
                }
                keys[size - 1] = null; // Обнуление последнего элемента
                values[size - 1] = null; // Обнуление последнего элемента
                size--;
                return value;
            }
        }
        return null; // если ключ не найден
    }

    public static void execute() {
        Dictionary<String, Integer> dictionary = new Dictionary<>(10);
        dictionary.add("Alice", 25);
        dictionary.add("Bob", 30);

        System.out.println(dictionary.get("Alice")); // Вывод: 25
        System.out.println(dictionary.get("Bob"));   // Вывод: 30

        dictionary.remove("Alice");
        System.out.println(dictionary.get("Alice")); // Вывод: null
    }
}