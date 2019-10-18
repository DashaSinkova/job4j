package ru.job4j.calculator;

/**
 * Calculate
 *
 * @author Daria Sinkova miss.sinkova-dasha@yanex.ru
 */
public class Calculator {
    public static void add(double first, double second) {
        System.out.println(first + " + " + second + " = " + (first + second));
    }

    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);

    }

    public static void div(double first, double second) {
        System.out.println(first + " / " + second + " = " + (first / second));
    }

    public static void multiply(double first, double second) {
        System.out.println(first + " * " + second + " = " + (first * second));
    }

    public static void subtract(double first, double second) {
        System.out.println(first + " - " + second + " = " + (first - second));
    }
}
