package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> rsl = new HashSet<>();
        for (String dep : deps) {
            String str = "";
            for (String el : dep.split("/")) {
                str = str + el;
                rsl.add(str);
                str += "/";
            }
        }
        List<String> sortedDep = new ArrayList<>(rsl);
        sortAsc(sortedDep);
        return sortedDep;
    }

    public static void sortAsc(List<String> deps) {
        Collections.sort(deps, Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> deps) {
        Collections.sort(deps, new DepDescComp());
    }
}
