package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SquareTest {
    Square sq = new Square();
    @Test
    public void whenBound3Then149() {
        assertThat(sq.calculate(3), is(new int[]{1, 4, 9}));
    }
    @Test
    public void whenBound4Then14916() {
        assertThat(sq.calculate(4), is(new int[]{1, 4, 9, 16}));
    }
    @Test
    public void whenBound6Then149162536() {
        assertThat(sq.calculate(6), is(new int[]{1, 4, 9, 16, 25, 36}));
    }
}
