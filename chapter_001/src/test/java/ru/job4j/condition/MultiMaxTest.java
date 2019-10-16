package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        assertThat(check.max(1, 42, 12), is(42));
    }
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        assertThat(check.max(42, 1, 12), is(42));
    }
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        assertThat(check.max(1, 12, 42), is(42));
    }
    @Test
    public void whenAllTheSame() {
        MultiMax check = new MultiMax();
        assertThat(check.max(1, 1, 1), is(1));
    }
}
