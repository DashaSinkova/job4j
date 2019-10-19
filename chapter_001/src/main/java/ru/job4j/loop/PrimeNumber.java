package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = finish - 1;
        for (int var = 2; var <= finish; var++) {
            for (int i = 2; i < var; i++) {
                if (var % i == 0) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }

}
