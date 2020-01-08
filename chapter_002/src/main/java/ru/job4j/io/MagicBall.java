/**
 * 1. Чтение из консоли. Класс Scanner.[#188288]
 */
package ru.job4j.io;
import java.util.Random;
import java.util.Scanner;
public class MagicBall {
    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String q = question.nextLine();
        int t = new Random().nextInt(3);
        switch (t) {
            case 0:
                System.out.println("Да");
                break;
            case 1:
                System.out.println("Нет");
                break;
            default:
                System.out.println("Может быть");
        }
    }
}
