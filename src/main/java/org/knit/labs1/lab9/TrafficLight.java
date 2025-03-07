package org.knit.labs1.lab9;

public enum TrafficLight {
    RED,
    YELLOW,
    GREEN;

    // Метод для получения следующего сигнала светофора
    public TrafficLight getNextLight() {
        switch (this) {
            case RED:
                return YELLOW;
            case YELLOW:
                return GREEN;
            case GREEN:
                return RED;
            default:
                throw new IllegalArgumentException("Invalid traffic light state");
        }
    }
}
