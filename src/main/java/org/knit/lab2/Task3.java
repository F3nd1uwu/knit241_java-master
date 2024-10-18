package org.knit.lab2;
import java.util.Scanner;

public class Task3 {
    public void execute() {
        String user_input = "";
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            try {
                System.out.print("Введите первое число: ");
                user_input = scanner.nextLine();
                if (user_input.equals("exit")) {
                    System.out.println("Выход из программы.");
                    break;
                }
                double a = Double.parseDouble(user_input);

                System.out.print("Введите оператор (+, -, *, /): ");
                user_input = scanner.nextLine();
                if (user_input.equals("exit")) {
                    System.out.println("Выход из программы.");
                    break;
                }
                String operation = user_input;

                System.out.print("Введите второе число: ");
                user_input = scanner.nextLine();
                if (user_input.equals("exit")) {
                    System.out.println("Выход из программы.");
                    break;
                }
                double b = Double.parseDouble(user_input);

                switch (operation) {
                    case "+":
                        System.out.println("Результат: " + calculator.add(a, b));
                        break;
                    case "-":
                        System.out.println("Результат: " + calculator.subtract(a, b));
                        break;
                    case "*":
                        System.out.println("Результат: " + calculator.multiply(a, b));
                        break;
                    case "/":
                        System.out.println("Результат: " + calculator.divide(a, b));
                        break;
                }
            } catch (Exception e) {
                System.out.println("Некорректный ввод.");
            } finally {
                System.out.println();
            }
        }
    }
}