package ru.job4j.lambda;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Count {
    public static Map<String, Set<String>> count(List<StudentUnits> students) {
        return students.stream().flatMap(el -> el.getUnits().stream().map(unit -> new Holder(el.getName(), unit))).collect(Collectors.groupingBy(k -> k.key, Collector.of(HashSet::new, (set, el) -> set.add(el.value), (left, right) -> {
            left.addAll(right);
            return left;
        })));
    }
}
