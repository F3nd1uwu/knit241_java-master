package org.knit.labs1.lab9;

public class Task15 {
    public static void execute() {
        // Перебор всех времен года и вывод информации о них
        for (Season season : Season.values()) {
            System.out.println(season.name() + ": " + season.getTemperature() + ", типичный праздник - " + season.getTypicalHoliday());
        }
    }
}
