package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    Factorial fr = new Factorial();

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        assertThat(fr.calc(5), is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        assertThat(fr.calc(0), is(1));
    }
}
