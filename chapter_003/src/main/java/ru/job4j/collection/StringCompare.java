package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int res = left.length() - right.length();
        for(int i = 0; i < left.length(); i++) {
            if(left.charAt(i) != right.charAt(i)) {
                res = left.charAt(i) - right.charAt(i);
                break;
            }
        }
        return res;
    }
}
