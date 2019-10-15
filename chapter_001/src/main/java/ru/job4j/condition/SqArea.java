package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k){
        return Math.pow(p/(2*(k+1)),2)*k;
    }

    public static void main(String[] args) {
        System.out.println("Square is "+square(6,2));
        System.out.println("Square is "+square(4,1));
    }
}
