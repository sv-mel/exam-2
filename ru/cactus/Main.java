package ru.cactus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату последнего полива кактуса в формате ДД.ММ.ГГГГ");
        String dateLastWatering = sc.nextLine();
        sc.close();

        try {
            DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate date = LocalDate.parse(dateLastWatering, f);
            Season season = new Season(date);
        } catch (Exception e) {
            System.out.println("Неверный формат даты: " + e.getMessage());
        }
    }
}
