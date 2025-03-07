package org.knit.labs1.lab6;

import java.util.Set;
import java.util.TreeSet;

public class StudentManager {
    private Set<String> students;

    public StudentManager() {
        students = new TreeSet<>();
    }

    public void addStudent(String student) {
        if (students.contains(student)) {
            System.out.println("Ошибка: Студент с именем \"" + student + "\" уже существует.");
        } else {
            students.add(student);
            System.out.println("Студент добавлен.");
        }
    }

    public void removeStudent(String student) {
        if (students.remove(student)) {
            System.out.println("Студент удален.");
        } else {
            System.out.println("Ошибка: Студент с именем \"" + student + "\" не найден.");
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Список студентов пуст.");
        } else {
            System.out.println("Список студентов:");
            students.forEach(System.out::println);
        }
    }

    public void findStudent(String student) {
        if (students.contains(student)) {
            System.out.println("Студент \"" + student + "\" найден.");
        } else {
            System.out.println("Студент \"" + student + "\" не найден.");
        }
    }

    public void displayStudentsInRange(String start, String end) {
        Set<String> subSet = ((TreeSet<String>) students).subSet(start, true, end, true);
        if (subSet.isEmpty()) {
            System.out.println("Нет студентов в указанном диапазоне.");
        } else {
            System.out.println("Список студентов в диапазоне от \"" + start + "\" до \"" + end + "\":");
            subSet.forEach(System.out::println);
        }
    }
}