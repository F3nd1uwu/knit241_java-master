package org.knit.lab2;

public class Task5 {
    public static void execute() {
        // Создаем файлы
        FileSystemComponent file1 = new File("file1.txt", 100);
        FileSystemComponent file2 = new File("file2.txt", 200);
        FileSystemComponent file3 = new File("file3.txt", 300);

        // Создаем папки
        FileSystemComponent folder1 = new Folder("Folder1");
        FileSystemComponent folder2 = new Folder("Folder2");

        // Добавляем файлы в папки
        folder1.add(file1);
        folder1.add(file2);

        folder2.add(file3);
        folder2.add(folder1);

        // Выводим структуру файловой системы
        System.out.println("Пример 1:");
        folder2.display("");

        // Выводим общий размер папки 2
        System.out.println("Total size of Folder2: " + folder2.getSize() + " bytes");
        System.out.println();

        // Удаляем файл в папке
        folder1.remove(file1);

        // Выводим структуру файловой системы
        System.out.println("Пример 1:");
        folder2.display("");

        // Выводим общий размер папки 2
        System.out.println("Total size of Folder2: " + folder2.getSize() + " bytes");
        System.out.println();
    }
}
