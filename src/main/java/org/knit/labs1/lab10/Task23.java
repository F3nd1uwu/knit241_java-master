package org.knit.labs1.lab10;

public class Task23 {
    public static <T> void printType(T object) {
        if (object != null) {
            // Получаем имя класса объекта и выводим его
            System.out.println(object.getClass().getName());
        } else {
            System.out.println("null");
        }
    }

    public static void execute() {
        printType(123); // java.lang.Integer
        printType("Hello"); // java.lang.String
        printType(45.67); // java.lang.Double
        printType(new Object()); // java.lang.Object
        printType(null); // null
    }
}
