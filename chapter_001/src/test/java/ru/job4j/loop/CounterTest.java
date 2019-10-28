package ru.job4j.loop;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
import org.junit.Test;


public class CounterTest {
    @Test
    public void oneToFive() {
        Counter count = new Counter();
        assertThat(count.add(1, 5), is(6));
    }
    @Test
    public void zeroToZero() {
        Counter count = new Counter();
        assertThat(count.add(0, 0), is(0));
    }
}
