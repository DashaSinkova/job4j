package ru.job4j.massive;
import java.util.Arrays;

public class MasLesson {

    public static void main(String[] args) {
        int[][] mas = new int[5][];
        mas[0]= new int[3];
        mas[1] = new int[5];
        for (int i = 0; i < 1; i++)
            for (int j = 0; j < 3; j++){
                mas [i][j] = i+j*2;
        }
        for (int i = 1; i<2;i++)
            for (int j = 0; j<mas[1].length;j++) {
                mas[i][j] = i + j * 4;

            }
        System.out.println(Arrays.deepToString(mas));

    }
}
