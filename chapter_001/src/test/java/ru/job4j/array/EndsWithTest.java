package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class EndsWithTest {
    @Test
    public void whenEndWithPrefixThenTrue() {
        assertThat(EndsWith.endsWith(new char[]{'H', 'e', 'l', 'l', 'o'},
                new char[]{'l', 'o'}), is(true));
    }
    @Test
    public void whenEndWithPrefixThenFalse() {
        assertThat(EndsWith.endsWith(new char[]{'H', 'e', 'l', 'l', 'o'},
                new char[]{'l', 'a'}), is(false));
    }
}
