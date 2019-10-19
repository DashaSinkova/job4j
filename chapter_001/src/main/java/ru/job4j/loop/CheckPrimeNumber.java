package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean is_simple = true;
        for (int i = 2; i < finish; i++) {
            if (finish % i == 0)
                is_simple = false;
            break;
        }
        return is_simple;
    }
}
