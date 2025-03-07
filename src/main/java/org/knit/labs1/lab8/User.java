package org.knit.labs1.lab8;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L; // Для сериализации
    private String username;
    private int age;
    private String email;

    public User(String username, int age, String email) {
        this.username = username;
        this.age = age;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
