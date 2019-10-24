package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] mas = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length & j < right.length)
            mas[k++] = left[i] < right[j] ? left[i++] : right[j++];
        while (i < left.length)
            mas[k++] = left[i++];
        while (j < right.length)
            mas[k++] = right[j++];
        return mas;
    }
    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
