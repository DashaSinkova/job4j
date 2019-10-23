package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }
        return arr;
    }

}
