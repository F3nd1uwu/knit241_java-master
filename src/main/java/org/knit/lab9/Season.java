package org.knit.lab9;

public enum Season {
    WINTER("Холодно", "Новый год"),
    SPRING("Тепло", "Пасха"),
    SUMMER("Жарко", "День Независимости"),
    AUTUMN("Прохладно", "День учителя");

    private final String temperature;
    private final String typicalHoliday;

    Season(String temperature, String typicalHoliday) {
        this.temperature = temperature;
        this.typicalHoliday = typicalHoliday;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getTypicalHoliday() {
        return typicalHoliday;
    }
}