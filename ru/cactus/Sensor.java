package ru.cactus;

import java.util.Random;

public class Sensor {
    Random r = new Random();
    public int airHumidity = r.nextInt(10,80);

}
