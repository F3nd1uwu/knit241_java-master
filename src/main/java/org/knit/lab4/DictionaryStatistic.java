package org.knit.lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;

public class DictionaryStatistic {
    private ArrayList<String> words;
    private int dictionarySize; // Количество слов
    private int polindrom; // Количество слов полиндромов
    private int maxWordLength; // маскимальная длина слова в словаре
    private int minWordLength; // минимальная длина слова в словаре
    private Map<Character, Integer> alphabet; // буквы алфавита
    private double[] frequency; // частота букв в словаре (в каждой ячейке хранит частоту букв, а индекс - это позиция буквы в alpabet)
    Random random = new Random();

    public DictionaryStatistic(ArrayList<String> words, Map<Character, Integer> alphabet) {
        this.words = words;
        this.alphabet = alphabet;
        this.dictionarySize = words.size();
    }

    public String getRandomWord() {
        return words.get(random.nextInt(words.size()));
    }

    public void printSymbolsStat() {
        for (Map.Entry<Character, Integer> entry : alphabet.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue() + " букв");
        }
    }

    public int getPolindrom() {
        return polindrom;
    }

    public void setPolindrom(int polindrom) {
        this.polindrom = polindrom;
    }

    public int getMaxWordLength() {
        return maxWordLength;
    }

    public void setMaxWordLength(int maxWordLength) {
        this.maxWordLength = maxWordLength;
    }

    public int getMinWordLength() {
        return minWordLength;
    }

    public void setMinWordLength(int minWordLength) {
        this.minWordLength = minWordLength;
    }

    public double[] getFrequency() {
        return frequency;
    }

    public void setFrequency(double[] frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "DictionaryStatistic{" +
                "dictionarySize=" + dictionarySize +
                ", polindrom=" + polindrom +
                ", maxWordLength=" + maxWordLength +
                ", minWordLength=" + minWordLength +
                ", frequency=" + Arrays.toString(frequency) +
                '}';
    }
}
