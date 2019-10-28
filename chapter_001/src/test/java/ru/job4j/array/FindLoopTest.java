package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {
    FindLoop fl = new FindLoop();
    @Test
    public void whenArrayHas5Then0() {
        assertThat(fl.indexOf(new int[]{5, 3, 10}, 5), is(0));
    }
    @Test
    public void whenArrayHas11Then1() {

        assertThat(fl.indexOf(new int[]{5, 3, 10}, 11), is(-1));
    }
    @Test
    public void whenArrayHas10Then2() {
        assertThat(fl.indexOf(new int[]{5, 3, 3, 4, 2, 1, 10, 2, 3}, 10, 4, 7), is(6));
    }
}
