package org.knit.lab9;

import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object obj) throws ValidationException {
        StringBuilder errors = new StringBuilder();

        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true); // Доступ к приватным полям

            try {
                if (field.isAnnotationPresent(NotNull.class) && field.get(obj) == null) {
                    errors.append(field.getName()).append(" не может быть null.\n");
                }

                if (field.isAnnotationPresent(MaxLength.class)) {
                    MaxLength annotation = field.getAnnotation(MaxLength.class);
                    String value = (String) field.get(obj);
                    if (value != null && value.length() > annotation.value()) {
                        errors.append(field.getName()).append(" превышает максимальную длину ").append(annotation.value()).append(".\n");
                    }
                }

                if (field.isAnnotationPresent(Min.class)) {
                    Min annotation = field.getAnnotation(Min.class);
                    int value = (int) field.get(obj);
                    if (value < annotation.value()) {
                        errors.append(field.getName()).append(" не может быть меньше ").append(annotation.value()).append(".\n");
                    }
                }

                if (field.isAnnotationPresent(Range.class)) {
                    Range annotation = field.getAnnotation(Range.class);
                    int value = (int) field.get(obj);
                    if (value < annotation.min() || value > annotation.max()) {
                        errors.append(field.getName()).append(" должен быть в диапазоне [").append(annotation.min()).append(", ").append(annotation.max()).append("].\n");
                    }
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        if (errors.length() > 0) {
            throw new ValidationException(errors.toString());
        }
    }
}
