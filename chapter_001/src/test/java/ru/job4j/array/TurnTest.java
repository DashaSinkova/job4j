package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    Turn t = new Turn();
    @Test
    public void when2614() {
        assertThat(t.back(new int[]{4,1,6,2}),is(new int[]{2,6,1,4}));

    }
    @Test
    public void when54321() {
        assertThat(t.back(new int[]{1,2,3,4,5}),is(new int[]{5,4,3,2,1}));

    }
}
