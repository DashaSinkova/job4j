package ru.job4j.oop;

public class Jar {
    private int value;

    public Jar(int size) {
        this.value = size;
    }

    public void pour(Jar another) {
        int t = another.value + this.value;
        another.value = t / 2;
        this.value = another.value;
    }

    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);
    }
}
