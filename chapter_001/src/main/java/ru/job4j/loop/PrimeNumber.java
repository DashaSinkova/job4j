package ru.job4j.loop;

public class PrimeNumber {
    int count = 0;

    public int calc(int finish) {

        for (int var = 2; var <= finish; var++)
            count = check(var);

        return count;
    }

    public int check(int var) {

        for (int i = 2; i < var; i++) {
            if (var % i == 0) {
                count--;
                break;
            }
        }
        count++;
        return count;
    }
}