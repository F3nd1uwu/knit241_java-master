package org.knit.lab9;

import java.util.Scanner;

public class Task14 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);

        // Запрос текущего сигнала светофора
        System.out.print("Введите текущий сигнал светофора (RED, YELLOW, GREEN): ");
        String input = scanner.nextLine().toUpperCase(); // Приводим к верхнему регистру

        try {
            // Получение текущего сигнала из ввода
            TrafficLight currentLight = TrafficLight.valueOf(input);

            // Вывод следующего сигнала
            TrafficLight nextLight = currentLight.getNextLight();
            System.out.println("Следующий сигнал: " + nextLight);
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный сигнал светофора. Пожалуйста, введите RED, YELLOW или GREEN.");
        } finally {
            scanner.close();
        }
    }
}
