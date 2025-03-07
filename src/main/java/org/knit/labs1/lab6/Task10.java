package org.knit.labs1.lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task10 {
    public void execute() {
        boolean gameStatus = true;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<String> words = new ArrayList<>();
        // Чтение слов из файла
        try {
            Scanner scannerWords = new Scanner(new File("src/main/java/org/knit/lab6/words.txt"));
            while (scannerWords.hasNext()) {
                words.add(scannerWords.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл со словами не найден.");
            return;
        }

        while (gameStatus) {
            int lives = 6;
            String word = words.get(random.nextInt(words.size()));
            char[] letters = word.toCharArray();
            Set<Character> guessedLetters = new HashSet<>();

            // Основной игровой цикл
            while (true) {
                // Выводим текущее состояние слова
                for (char letter : letters) {
                    if (guessedLetters.contains(letter)) {
                        System.out.print(letter + " ");
                    } else {
                        System.out.print("_ ");
                    }
                }
                System.out.println("\nОсталось жизней: " + lives);
                System.out.print("Введите букву: ");
                char guessedLetter = scanner.nextLine().charAt(0);

                // Проверка, была ли буква уже угадана
                if (guessedLetters.contains(guessedLetter)) {
                    System.out.println("Вы уже угадали эту букву. Попробуйте другую.");
                    continue;
                }

                // Добавляем угаданную букву в множество
                guessedLetters.add(guessedLetter);

                // Проверка, есть ли буква в слове
                if (word.indexOf(guessedLetter) == -1) {
                    lives--; // Уменьшаем количество жизней
                    System.out.println("Неправильно! У вас осталось " + lives + " жизней.");
                } else {
                    System.out.println("Правильно!");
                }

                // Проверка, выиграл ли игрок
                boolean allGuessed = true;
                for (char letter : letters) {
                    if (!guessedLetters.contains(letter)) {
                        allGuessed = false;
                        break;
                    }
                }

                if (allGuessed) {
                    System.out.println("Поздравляем! Вы угадали слово: " + word);
                    break; // Выход из внутреннего цикла, чтобы начать новую игру
                }

                // Окончание игры
                if (lives == 0) {
                    System.out.println("Вы проиграли! Загаданное слово было: " + word);
                    break; // Выход из внутреннего цикла, чтобы начать новую игру
                }
            }

            // Запрос на продолжение или выход
            System.out.println("Хотите сыграть ещё раз? (да/нет)");
            String replayInput = scanner.nextLine();
            if (!replayInput.equalsIgnoreCase("да")) {
                gameStatus = false; // Выход из главного цикла
            }
        }

        scanner.close();
    }
}