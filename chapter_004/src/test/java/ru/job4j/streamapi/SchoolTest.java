package ru.job4j.streamapi;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import org.junit.Test;
import java.util.List;

public class SchoolTest {
    List<Student> students = List.of(
            new Student(10, "Ololoshkin"),
            new Student(52, "Lapin"),
            new Student(75, "Andreev"),
            new Student(10, "Ryabin"),
            new Student(100, "Trusova"),
            new Student(44, "Ivin")
            );
    @Test
    public void whenScoreFrom70to100() {
        List<Student> actual = School.collect(students, student -> student.getScore() >= 70 && student.getScore() <= 100);
        List<Student> expected = List.of(new Student(75, "Andreev"), new Student(100, "Trusova"));
        assertThat(actual.toString(), is(expected.toString()));
    }
    @Test
    public void whenScoreFrom50to70() {
        List<Student> actual = School.collect(students, student -> student.getScore() >= 50 && student.getScore() < 70);
        List<Student> expected = List.of(new Student(52, "Lapin"));
        assertThat(actual.toString(), is(expected.toString()));
    }
    @Test
    public void whenScoreFrom0to50() {
        List<Student> actual = School.collect(students, student -> student.getScore() > 0 && student.getScore() < 50);
        List<Student> expected = List.of(new Student(10, "Ololoshkin"), new Student(10, "Ryabin"), new Student(44, "Ivin"));
        assertThat(actual.toString(), is(expected.toString()));
    }
}
