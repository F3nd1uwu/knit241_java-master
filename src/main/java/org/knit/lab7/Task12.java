package org.knit.lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.FileVisitResult;
import java.util.List;

public class Task12 {
    private static int totalWordCount = 0;

    public static void execute() {
        Path startPath = Paths.get("src/main/java/org/knit/lab7/Folder1");
        try {
            Files.walkFileTree(startPath, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (file.toString().endsWith(".txt")) {
                        int wordCount = countWordsInFile(file);
                        System.out.println("Файл: " + file.getFileName() + ", количество слов: " + wordCount);
                        totalWordCount += wordCount;
                    }
                    return FileVisitResult.CONTINUE; // Продолжить обход
                }
            });

            System.out.println("Общее количество слов во всех текстовых файлах: " + totalWordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int countWordsInFile(Path file) throws IOException {
        // Считываем строки из файла и подсчитываем количество слов
        List<String> lines = Files.readAllLines(file);
        int wordCount = 0;

        for (String line : lines) {
            // Учитываем слова: разбиваем строки по пробелам
            String[] words = line.trim().split("\\s+");
            wordCount += words.length;
        }

        return wordCount;
    }
}

