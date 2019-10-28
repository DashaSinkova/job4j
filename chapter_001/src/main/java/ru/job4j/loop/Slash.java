package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int raw = 0; raw < size; raw++) {
            for (int cell = 0; cell < size; cell++) {
                if (raw == cell) {
                    System.out.print("0");
                } else if ((raw + cell) % (size - 1) == 0) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("Draw by 3:");
        draw(3);
        System.out.println();
        System.out.println("Draw by 5:");
        draw(5);

    }
}
