package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        int res = second.compareTo(first);
        if (first.charAt(1) == second.charAt(1)) {
            res = first.compareTo(second);
        }
        return res;
    }
}
