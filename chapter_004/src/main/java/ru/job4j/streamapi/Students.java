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
}