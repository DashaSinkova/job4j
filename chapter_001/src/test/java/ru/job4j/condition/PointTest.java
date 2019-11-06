package ru.job4j.condition;
import org.junit.*;

public class PointTest {
    @Test
    public void distance() {
        Assert.assertEquals(2, new Point(0, 2).distance(new Point(0, 0)), 0.01);
    }
    @Test
    public void distance3d() {
        Assert.assertEquals(2, new Point(0, 0, 1).distance3d(new Point(0, 2, 1)), 0.01);
    }
}
