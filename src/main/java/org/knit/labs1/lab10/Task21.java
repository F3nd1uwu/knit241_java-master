package org.knit.labs1.lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task21 {
    public static <T> List<T> filter(List<T> items, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T item : items) {
            if (predicate.test(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public static void execute() {
        List<String> words = List.of("apple", "banana", "cherry");
        List<String> filtered = filter(words, s -> s.startsWith("b"));
        System.out.println(filtered);
    }
}