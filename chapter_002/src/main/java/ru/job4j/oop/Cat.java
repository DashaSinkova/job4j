package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;
    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Snezhok");
        gav.show();
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Marsik");
        black.show();
    }

    public void show() {
        System.out.println(this.name+"'s food are: "+this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }
}
