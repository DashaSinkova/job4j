package ru.job4j.loop;

public class PrimeNumber {

    public int calc(int finish) {
        int count = 0;
        for (int var = finish; var >= 2; var--)
            count += check(var);

        return (finish - 1) - count;
    }

    public int check(int var) {
        int c = 0;
        for (int i = 2; i < var; i++) {
            if (var % i == 0) {
                c++;
                break;
            }
        }
        return c;
    }
}