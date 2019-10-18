package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FitnessTest {
    Fitness ft = new Fitness();

    @Test
    public void whenIvanGreatNick() {
        assertThat(ft.calc(95, 90), is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        assertThat(ft.calc(90, 95), is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        assertThat(ft.calc(50, 90), is(2));
    }
}

