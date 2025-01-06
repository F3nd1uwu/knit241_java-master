package org.knit.lab9;

public class Task17 {
    public static void execute() {
        User user = new User("John", "Doe123", 15, 150);

        try {
            Validator.validate(user);
        } catch (ValidationException e) {
            System.out.println("Ошибка валидации: " + e.getMessage());
        }
    }
}
