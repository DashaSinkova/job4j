/**
 *2. Scanner и чтение числа из консоли.[#188289]
 */
package ru.job4j.io;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        System.out.println("Перед вами игра 11. На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек" + System.lineSeparator() + "Выигрывает тот, кто забрал последние спички.");
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        int count = 11;
        while (count > 0) {
            if (flag) {
                System.out.println("Ввод первого игрока:");
            } else {
                System.out.println("Ввод второго игрока:");
            }
            int inputPlayer = Integer.valueOf(input.nextLine());
            if (inputPlayer > 0 && inputPlayer <= 3 && inputPlayer <= count) {
                count = count - inputPlayer;
                System.out.println("Осталось " + count + " спичек");
                flag = !flag;
                System.out.println();
            } else {
                System.out.println("Введите цифру меньше остатка от 1 до 3.");
            }
        }
        System.out.println("Игра завершена!");
        if (flag) {
            System.out.println("Выиграл второй игрок");
        } else {
            System.out.println("Выиграл первый игрок");
        }
    }
}
