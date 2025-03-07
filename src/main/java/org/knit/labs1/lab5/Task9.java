package org.knit.labs1.lab5;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Task9 {
    public static final long TIME_LIMIT = 10 * 1000;
    public static void execute() {
        String path = "src/main/java/org/knit/lab5/dictionary.txt";
        Dictionary dictionary = new Dictionary();
        try {
            dictionary.setWords(path);
        } catch (FileNotFoundException e) {
            System.out.println("Неправильный путь к файлу.");
        }

        Scanner scanner = new Scanner(System.in);
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        AtomicInteger totalWords = new AtomicInteger(-1);
        AtomicInteger correctCount = new AtomicInteger(0);
        AtomicInteger totalInputChars = new AtomicInteger(0);
        long startTime = System.currentTimeMillis();



        Runnable task = () -> {
            if (System.currentTimeMillis() - startTime < TIME_LIMIT) {
                String randomWord = dictionary.getRandomWord();
                totalWords.addAndGet(1);
                System.out.println("Введите это слово: " + randomWord);
                String userInput = scanner.nextLine();
                if (userInput.equals(randomWord)) {
                    correctCount.addAndGet(1);
                }
                totalInputChars.addAndGet(userInput.length());
            } else {
                executor.shutdownNow();
            }
        };

        executor.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);

        try {
            Thread.sleep(TIME_LIMIT);
        } catch (InterruptedException e) {
            return;
        }

        System.out.println("Всего слов: " + totalWords);
        System.out.println("Правильно написанных слов: " + correctCount);
        System.out.println("Всего введенных символов: " + totalInputChars.get());

        double speed = (double) totalInputChars.get() / 60.0;
        System.out.println("Скорость печати: " + speed + " символов/секунду");

        scanner.close();
    }
}