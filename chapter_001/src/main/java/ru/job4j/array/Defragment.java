package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            while (j <= array.length - 1 && array[i] == null) {
                if (array[j] != null) {
                    String t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                    i++;
                }
                j++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}

