package ru.job4j.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> rsl = new HashSet<>();
        for (String dep : deps) {
            String[] sectionsOfDep = dep.split("/");
            if (!deps.contains(sectionsOfDep[0])) {
                rsl.add(sectionsOfDep[0]);
            }
            rsl.add(dep);
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
