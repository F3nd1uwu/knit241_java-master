package org.knit.lab4;

import java.io.File;
import java.util.*;

public class Task7 {
    public static void execute() {
        ArrayList<String> words = new ArrayList<>();
        Map<Character, Integer> alph = new TreeMap<>();
        int polindrom = 0;
        int max = 0;
        int min = 99999;
        int sum = 0;
        double[] frequency = new double[33];
        try {
            Scanner scanner = new Scanner(new File("src/main/java/org/knit/lab4/dictionary.txt"));
            while (scanner.hasNext()) {
                String word = scanner.nextLine();
                words.add(word);
            }
            scanner.close();
            for (String word : words) {
                // алфавит
                for (Character letter : word.toCharArray()) {
                    if (Character.toLowerCase(letter) != Character.toUpperCase(letter)) {
                        alph.put(letter, alph.getOrDefault(letter, 0) + 1);
                    }
                }

                // полиндромы
                if (new StringBuilder(word).reverse().toString().equals(word)) {
                    polindrom += 1;
                }

                // максимальная длина слова
                if (word.length() > max) {
                    max = word.length();
                }

                // минимальная длина слова
                if (word.length() < min) {
                    min = word.length();
                }
            }

            // частота
            for (Integer value : alph.values()) {
                sum += value;
            }
            int k = 0;
            for (Integer value : alph.values()) {
                frequency[k] = (double) value / sum;
                k += 1;
            }


            DictionaryStatistic dict = new DictionaryStatistic(words, alph);
            dict.setPolindrom(polindrom);
            dict.setMaxWordLength(max);
            dict.setMinWordLength(min);
            dict.setFrequency(frequency);


            // демонстрация разработанных методов
            System.out.println(dict.getRandomWord());
            dict.printSymbolsStat();
            System.out.println(dict);
            GameInWords.startGame(words);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
