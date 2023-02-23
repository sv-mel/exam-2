package ru.cactus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Date today");
        String datePlant = sc.nextLine();
        System.out.println(datePlant);
        Sensor s = new Sensor();
        System.out.println(s.airHumidity);

    }
}
