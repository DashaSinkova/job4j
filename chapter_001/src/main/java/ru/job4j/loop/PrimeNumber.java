package ru.job4j.loop;

public class PrimeNumber {
    int count = 0;
    int cheat = 0;

    public int calc(int finish) {

        if (finish < 2) return  1;
        for (int var = 2; var < finish; var++) {
            if (finish % var == 0) {
                count--;
                break;
            }
        }
        cheat++;
        calc(finish - 1);
        return cheat + count;
    }
}
