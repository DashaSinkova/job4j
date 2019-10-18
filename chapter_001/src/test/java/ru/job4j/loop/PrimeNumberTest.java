package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberTest {
    PrimeNumber prime = new PrimeNumber();

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
