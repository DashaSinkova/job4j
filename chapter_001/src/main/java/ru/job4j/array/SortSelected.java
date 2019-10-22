package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length-1; i++) {
            int min = findMin(data, i, data.length - 1);
            int index = indexOf(data, min, i, data.length - 1);
            int t = data[i];
            data[i] = min;
            data[index] = t;
        }

        return data;
    }

    public static int findMin(int[] data, int start, int finish) {
        int min = data[start];
        for (int i = start; i <= finish; i++) {
            if (min > data[i]) min = data[i];
        }
        return min;

    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

}
