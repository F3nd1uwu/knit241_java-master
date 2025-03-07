package org.knit.labs1.lab6;

import java.util.Scanner;

public class Task11 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить студента");
            System.out.println("2. Удалить студента");
            System.out.println("3. Показать всех студентов");
            System.out.println("4. Найти студента");
            System.out.println("5. Поиск студентов по диапазону");
            System.out.println("6. Выйти");
            System.out.print("Выберите опцию: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите имя студента: ");
                    String studentToAdd = scanner.nextLine();
                    manager.addStudent(studentToAdd);
                    break;

                case 2:
                    System.out.print("Введите имя студента для удаления: ");
                    String studentToRemove = scanner.nextLine();
                    manager.removeStudent(studentToRemove);
                    break;

                case 3:
                    manager.displayStudents();
                    break;

                case 4:
                    System.out.print("Введите имя студента для поиска: ");
                    String studentToFind = scanner.nextLine();
                    manager.findStudent(studentToFind);
                    break;

                case 5:
                    System.out.print("Введите первого студента из списка: ");
                    String start = scanner.nextLine();
                    System.out.print("Введите второго студента из списка: ");
                    String end = scanner.nextLine();
                    manager.displayStudentsInRange(start, end);
                    break;

                case 6:
                    System.out.println("Выход из программы.");
                    break;

                default:
                    System.out.println("Некорректный выбор. Пожалуйста, выберите номер из меню.");
            }
        } while (choice != 6);
        scanner.close();
    }
}



