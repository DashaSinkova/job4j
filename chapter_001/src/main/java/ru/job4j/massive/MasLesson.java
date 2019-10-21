package ru.job4j.massive;

public class MasLesson {

    public static void main(String[] args) {
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++)
            mas[i] = 10 + i;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = mas.length - i;
            System.out.print(mas[i]+" ");

        }
    }
}
