package ru.job4j.oop;

public class Cat {
    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        System.out.println(peppy.sound());
    }

    public String sound() {
        return "may-may";
    }
}
