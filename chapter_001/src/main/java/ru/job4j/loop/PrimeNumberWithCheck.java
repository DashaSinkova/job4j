package ru.job4j.loop;

public class PrimeNumberWithCheck {
    private CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();

    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (checkPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }
}
