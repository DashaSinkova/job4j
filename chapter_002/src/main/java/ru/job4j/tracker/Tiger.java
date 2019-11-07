package ru.job4j.tracker;

public class Tiger extends Predator {
    public Tiger(String name) {
        super(name);
        System.out.println("Имя класса Tiger");
    }

    public static void main(String[] args) {
        Tiger t = new Tiger("TIGER");
    }
}
