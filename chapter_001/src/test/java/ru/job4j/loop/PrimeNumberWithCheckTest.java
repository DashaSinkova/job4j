package ru.job4j.loop;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class PrimeNumberWithCheckTest {
    PrimeNumberWithCheck prime = new PrimeNumberWithCheck();

    @Test
    public void when5() {

        assertThat(prime.calc(5), is(3));
    }

    @Test
    public void when11() {
        assertThat(prime.calc(11), is(5));

    }

    @Test
    public void when2() {
        assertThat(prime.calc(2), is(1));
    }
}
