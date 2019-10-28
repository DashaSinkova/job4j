package ru.job4j.loop;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class CheckPrimeNumberTest {
    CheckPrimeNumber ch = new CheckPrimeNumber();
    @Test
    public void when5() {
        assertThat(ch.check(7), is(true));
    }
    @Test
    public void when4() {
        assertThat(ch.check(30), is(false));
    }
}
