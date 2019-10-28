package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean isSimple = true;
        for (int i = 2; i < finish; i++) {
            if (finish % i == 0) {
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }
}
