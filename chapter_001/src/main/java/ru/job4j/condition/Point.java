package ru.job4j.condition;

public class Point {
    public static void main(String[] args) {
        System.out.println("result (0, 0) to (2, 0) = " + distance(0, 0, 2, 0));
        System.out.println("result (0, 0) to (2, 0) = " + distance(2, 1, 5, 0));
        System.out.println("result (0, 0) to (2, 0) = " + distance(5, 6, 0, -1));
    }
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
