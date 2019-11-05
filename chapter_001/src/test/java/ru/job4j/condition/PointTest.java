package ru.job4j.condition;
import org.junit.*;

public class PointTest {
    @Test
    public void distance() {
        Assert.assertEquals(2, new Point(0, 2).distance(new Point(0, 0)), 0.01);
    }

}
