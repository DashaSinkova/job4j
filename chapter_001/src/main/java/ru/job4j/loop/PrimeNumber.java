package ru.job4j.loop;

public class PrimeNumber {
    public  int calc(int finish) {
        int count = 0;
        for (int var = 2; var <= finish; var++)
            metka:{
                for (int i = 2; i < var; i++) {
                    if (var != i & var % i == 0) break metka;
                }
                count++;
            }
        return count;
    }


}
