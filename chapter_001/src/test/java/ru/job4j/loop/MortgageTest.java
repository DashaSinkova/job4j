package ru.job4j.loop;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class MortgageTest {
    Mortgage m = new Mortgage();
    @Test
    public void when1year() {
        assertThat(m.year(1000,  1200, 1), is(1));

    }
    @Test
    public void when2year() {
        assertThat(m.year(100,  120,  50), is(2));
    }


}
