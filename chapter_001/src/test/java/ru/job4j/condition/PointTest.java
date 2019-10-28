package ru.job4j.condition;
import org.junit.*;

public class PointTest {
    @Test
    public void distance() {
        Assert.assertEquals(2, Point.distance(0, 0, 2, 0), 0.01);
        Assert.assertEquals(3, Point.distance(2, 1, 5, 0), 0.17);
    }

}
