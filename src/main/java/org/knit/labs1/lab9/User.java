package org.knit.labs1.lab9;

public class User {
    @NotNull
    private String name;

    @MaxLength(10)
    private String surname;

    @Min(18)
    private int age;

    @Range(min = 1, max = 100)
    private int score;

    public User(String name, String surname, int age, int score) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.score = score;
    }
}