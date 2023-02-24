package ru.cactus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Season {
    public Season (LocalDate dateWatering) {
        int seasonYear = dateWatering.getMonthValue();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        if (seasonYear == 6 || seasonYear == 7 || seasonYear == 8) {
            {
                System.out.println("лето");
                Sensor sensor = new Sensor();
                System.out.println("влажность " + sensor.airHumidity);
                if (sensor.airHumidity <= 30) {
                    System.out.println ("дата следующего полива " + formatter.format(dateWatering.plusDays(2)));
                } else {
                    System.out.println("Проверь завтра влажность, пока рано поливать");}
            }
        } else if (seasonYear == 1 || seasonYear == 2 || seasonYear == 12) {
            System.out.println("зима");
            System.out.println ("дата следующего полива " + formatter.format(dateWatering.plusMonths(1)));
        }
        else {
            System.out.println("весна или осень");
            System.out.println ("дата следующего полива " + formatter.format(dateWatering.plusWeeks(1)));

        }
    }
}