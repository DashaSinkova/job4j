package ru.job4j.loop;

public class Fitness {
    public int calc(int ivan, int nick) {
        int month = 0;
        while (ivan < nick) {
            ivan *= 3;
            nick *= 2;
            month++;
        }
        return month;
    }
}
