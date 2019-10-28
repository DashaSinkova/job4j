package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        assertThat(MinDiapason.findMin(new int[]{0, 10, 2, 31, 3, 2}, 2, 4), is(2));
    }
    @Test
    public void whenSecondMin() {
        assertThat(MinDiapason.findMin(new int[]{10, 1, 2, 31, 3, 2}, 0, 2), is(1));
    }
    @Test
    public void whenMinThird() {

        assertThat(MinDiapason.findMin(new int[]{10, 1, -2, 31, 3, 2}, 2, 4), is(-2));
    }
}
