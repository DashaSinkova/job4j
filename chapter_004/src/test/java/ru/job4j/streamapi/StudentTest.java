package ru.job4j.streamapi;
import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;
import org.junit.Test;

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
}
