package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean is_simple = false;
        for (int i = 2; i < finish; i++) {
            if (finish % i == 0) {
                is_simple = false;
                break;
            } else is_simple = true;
        }
        return is_simple;
    }
}
