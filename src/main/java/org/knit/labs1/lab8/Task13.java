package org.knit.labs1.lab8;

import java.util.Scanner;

public class Task13 {
    private static final String FILE_PATH = "src/main/java/org/knit/lab8/users.dat";
    private static UserManager userManager;
    private static Scanner scanner;

    public static void execute() {
        userManager = new UserManager(FILE_PATH);
        scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nВыберите действие::");
            System.out.println("1. Добавить нового пользователя");
            System.out.println("2. Показать всех пользователей");
            System.out.println("3. Сохранить список пользователей в файл");
            System.out.println("4. Загрузить список пользователей из файла");
            System.out.println("5. Выйти\n");
            System.out.print("Введите номер действия: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    showUsers();
                    break;
                case 3:
                    userManager.saveUsers();
                    break;
                case 4:
                    userManager = new UserManager(FILE_PATH);
                    System.out.println("Список пользователей загружен.");
                    break;
                case 5:
                    userManager.saveUsers();
                    System.out.println("Данные сохранены. Выход из программы.");
                    break;
                default:
                    System.out.println("Неверная команда.");
            }
        } while (choice != 5);
    }

    private static void addUser() {
        System.out.print("Введите имя пользователя: ");
        String username = scanner.nextLine();
        System.out.print("Введите возраст: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите email: ");
        String email = scanner.nextLine();
        User user = new User(username, age, email);
        userManager.addUser(user);
        System.out.println("Пользователь добавлен.");
    }

    private static void showUsers() {
        System.out.println("Список пользователей:");
        for (User user : userManager.getUsers()) {
            System.out.println(user);
        }
    }
}