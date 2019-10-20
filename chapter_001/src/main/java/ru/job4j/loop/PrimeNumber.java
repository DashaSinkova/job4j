package ru.job4j.loop;

public class PrimeNumber {

    public int calc(int finish) {
        int count = 0;
        for ( ; finish >= 2; finish--)
            count += check(finish);

        return  count;
    }

    public int check(int var) {
        int c = 0;
        boolean isPrime = true ;
        for (int i = 2; i < var; i++) {
            if (var % i == 0) {
                isPrime = false;
                break;
            }
        }
       if(isPrime) c++;
       return c;
    }
}