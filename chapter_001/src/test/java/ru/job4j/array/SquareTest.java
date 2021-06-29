package ru.job4j.array;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SquareTest {
    @Test
    public void whenBound3Then014() {
        Square sq = new Square();
        assertArrayEquals(sq.calculate(3), new int[]{0, 1, 4});
    }
    @Test
    public void whenBound4Then014916() {
        Square sq = new Square();
        assertThat(sq.calculate(5), is(new int[]{0, 1, 4, 9, 16}));
    }
    @Test
    public void whenBound6Then0149162536() {
        Square sq = new Square();
        assertThat(sq.calculate(7), is(new int[]{0, 1, 4, 9, 16, 25, 36}));
    }
}
