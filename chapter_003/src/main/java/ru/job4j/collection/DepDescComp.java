package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        int tmp = second.split("/")[0].compareTo(first.split("/")[0]);
        return tmp == 0 ? first.compareTo(second) : tmp;
    }
}
