package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    Check check = new Check();
    @Test
    public void whenDataMonoByTrueThenTrue() {


        assertThat(check.mono(new boolean[]{true, true, true}), is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        assertThat(check.mono(new boolean[]{true, false, true}), is(false));
    }
}
