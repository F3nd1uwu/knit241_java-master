package org.knit.labs1.lab9;

public enum Rank {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("Валет"),
    QUEEN("Дама"),
    KING("Король"),
    ACE("Туз");
    private final String name;

    Rank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}