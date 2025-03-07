package org.knit.labs2.lab1.Task1;

import java.util.Scanner;

public class Task2_1 {
    public static void execute() {
        // Создаем обработчиков
        Approver callCenter = new CallCenter();
        Approver manager = new Manager();
        Approver departament = new Departament();
        Scanner scanner = new Scanner(System.in);

        // Устанавливаем цепочку: junior -> senior -> director
        callCenter.setNextApprover(manager);
        manager.setNextApprover(departament);

        // Условный пример центра поддержки
        System.out.println("Введите ваш вопрос: ");
        String userinput = scanner.next();

        System.out.println("В центре поддержки, который перенаправляет запросы: ");
        int value = scanner.nextInt();

        // Запрос
        callCenter.processRequest(value);
    }
}
