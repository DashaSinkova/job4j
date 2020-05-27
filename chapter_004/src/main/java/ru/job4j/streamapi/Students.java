package ru.job4j.streamapi;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Students {
    public static Map<String, Student> transformToMap(List<Student> students) {
        return students.stream().collect(Collectors.toMap(Student::getSurname, student -> student, (firstStudent, secondStudent) -> firstStudent));
    }
    public static List<Student> levelOf(List<Student> students, int bound) {
        Comparator<Student> comparator = Comparator.comparing(Student::getScore);
        return students.stream().flatMap(Stream :: ofNullable).sorted(comparator).dropWhile(el -> el.getScore() < bound).collect(Collectors.toList());
    }
}