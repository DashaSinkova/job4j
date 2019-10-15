package ru.job4j.converter;

public class Converter {
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = (int)rubleToEuro(140);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        System.out.println("120 rubles are 2 dollars. Test result : "+((int)rubleToDollar(120)==2));

        System.out.println("2 dollars are 120 rubles. Test result : "+(dollarToRuble(2)==120));

        System.out.println("2 euro are 140 rubles. Test result : " + (euroToRuble(3)==140));
    }

    public static float rubleToEuro(int value) {
        return (float) value / 70;
    }

    public static float rubleToDollar(int value) {
        return (float) value / 60;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }
}
