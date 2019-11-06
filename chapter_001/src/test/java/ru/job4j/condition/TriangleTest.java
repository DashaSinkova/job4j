package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Triangle t = new Triangle(new Point(0, 2), new Point(0, 0), new Point(2, 0));
        assertEquals(2, t.area(), 0.1);
    }
}
