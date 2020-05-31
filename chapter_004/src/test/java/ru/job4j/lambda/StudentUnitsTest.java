package ru.job4j.lambda;
import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentUnitsTest {
    @Test
    public void whenGroupByName() {
        List<StudentUnits> students = new ArrayList<>();
        students.add(new StudentUnits("Sinkova", Set.of("java", "youtube", "eng")));
        students.add(new StudentUnits("Lapin", Set.of("java", "math", "eng")));
        students.add(new StudentUnits("Andreev", Set.of("java", "math", "history")));
        Map<String, Set<String>> expected = Map.of("Sinkova", Set.of("java", "youtube", "eng"), "Lapin", Set.of("java", "math", "eng"), "Andreev", Set.of("java", "math", "history"));
        assertThat(Count.count(students), is(expected));
    }
    @Test
    public void whenGroupByNameSearch() {
        List<StudentUnits> students = new ArrayList<>();
        students.add(new StudentUnits("Sinkova", Set.of("java", "youtube", "eng")));
        students.add(new StudentUnits("Lapin", Set.of("java", "math", "eng")));
        students.add(new StudentUnits("Andreev", Set.of("java", "math", "history")));
        Map<String, Set<String>> expected = Map.of("Sinkova", Set.of("java", "youtube", "eng"), "Lapin", Set.of("java", "math", "eng"), "Andreev", Set.of("java", "math", "history"));
        Map<String, Set<String>> actual = Count.count(students);
        assertThat(actual.get("Sinkova"), is(Set.of("java", "youtube", "eng")));
    }
}
