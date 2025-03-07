package org.knit.labs1.lab10;

public class Task18 {
    public static void execute() {
        // Создание экземпляра Pair с типами String и Integer
        Pair<String, Integer> pair = new Pair<>("Age", 30);

        // Получение значений
        System.out.println(pair.getFirst());  // Вывод: Age
        System.out.println(pair.getSecond()); // Вывод: 30

        // Изменение значения второй сущности
        pair.setSecond(35);
        System.out.println(pair.getSecond()); // Вывод: 35

        // Смена первого значения
        pair.setFirst("New Age");
        System.out.println(pair.getFirst()); // Вывод: New Age

        // Вывод всей пары
        System.out.println(pair); // Вывод: Pair{first=New Age, second=35}
    }
}
