package org.knit.labs1.lab10;

public class Pair<F, S> {
    private F first; // Первая сущность
    private S second; // Вторая сущность

    // Конструктор для инициализации значений
    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    // Метод для получения значения первой сущности
    public F getFirst() {
        return first;
    }

    // Метод для получения значения второй сущности
    public S getSecond() {
        return second;
    }

    // Метод для изменения значения первой сущности
    public void setFirst(F first) {
        this.first = first;
    }

    // Метод для изменения значения второй сущности
    public void setSecond(S second) {
        this.second = second;
    }

    // Метод для отображения значений пары
    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
