package org.knit.lab4;

import java.util.*;


public class GameInWords {
    public static void startGame(ArrayList<String> words) {
        Scanner scanner = new Scanner(System.in);
        String user_input;
        while (true) {
            System.out.print("Введите ваше слово: ");
            user_input = scanner.nextLine();
            if (user_input.equals("exit")) {
                break;
            }
            List<String> foundWords = findWords(user_input, words);
            if (foundWords.isEmpty()) {
                System.out.println("Нет слов, которые могут быть составлены из введенного слова.");
            } else {
                System.out.println("Найденные слова: " + foundWords);
            }
        }
    }

    private static List<String> findWords(String input, List<String> dictionary) {
        Map<Character, Integer> letterCount = new HashMap<>();
        for (char letter : input.toCharArray()) {
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
        }

        List<String> result = new ArrayList<>();
        for (String word : dictionary) {
            if (canFormWord(word, letterCount)) {
                result.add(word);
            }
        }
        return result;
    }

    private static boolean canFormWord(String word, Map<Character, Integer> letterCount) {
        Map<Character, Integer> tempCount = new HashMap<>(letterCount);
        for (char letter : word.toCharArray()) {
            if (!tempCount.containsKey(letter) || tempCount.get(letter) == 0) {
                return false;
            }
            tempCount.put(letter, tempCount.get(letter) - 1);
        }
        return true;
    }
}
