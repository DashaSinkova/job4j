package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int res = 0;
        int i;
        for(i = 0; i < left.length(); i++) {
            int dif = left.charAt(i) - right.charAt(i);
            if(dif > 0) {
                res = 1;
                break;
            } else if(dif < 0) {
                res = -1;
                break;
            }
        }
        if(i >= left.length() && i < right.length()) {
            res = Character.compare((char) 0, right.charAt(i));
        }
        return res;
    }
}
