package ru.job4j.streamapi;
import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentTest {
    @Test
    public void listToMap() {
        List<Student> students = List.of(
                new Student(10, "Ololoshkin"),
                new Student(52, "Lapin"),
                new Student(52, "Lapin"),
                new Student(10, "Lapin"),
                new Student(75, "Andreev"),
                new Student(10, "Ryabin"));

        Map<String, Student> actual = Students.transformToMap(students);
        assertThat(actual.get("Ololoshkin"), is(new Student(10, "Ololoshkin")));
        assertThat(actual.get("Lapin"), is(new Student(52, "Lapin")));
        assertThat(actual.size(), is(4));
    }
    @Test
    public void scoreMoreThanBound() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "Ololoshkin"));
        students.add(null);
        students.add(new Student(52, "Lapin"));
        students.add(new Student(52, "Lapin"));
        students.add(null);
        students.add(new Student(75, "Andreev"));
        List<Student> expected = List.of(
                new Student(52, "Lapin"),
                new Student(52, "Lapin"),
                new Student(75, "Andreev"));
        List<Student> actual = Students.levelOf(students, 50);
        assertThat(actual.toString(), is(expected.toString()));
    }
}
