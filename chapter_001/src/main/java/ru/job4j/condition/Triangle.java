package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double a, double b, double c) {
        return a + b > c &&  a + c > b && b + c > a;
    }
}
