package ru.job4j.condition;

/**
 * 3. Перегрузить метод max для трех чисел[#188311]
 */
public class Max {
    public static int max(int left, int right) {
        return (left > right) ? left : right;
    }

    public static int max(int first, int second, int third) {
        int left = max(first, second);
        return (left > third) ? left : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        int left = max(first, second);
        int right = max(third, fourth);
        return (left > right) ? left : right;
    }
}
