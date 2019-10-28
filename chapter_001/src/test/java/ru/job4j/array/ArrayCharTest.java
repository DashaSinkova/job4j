package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
       assertThat(ArrayChar.startsWith(new char[]{'H', 'e', 'l', 'l', 'o'},
               new char[] {'H', 'e'}), is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        assertThat(ArrayChar.startsWith(new char[]{'H', 'e', 'l', 'l', 'o'},
                new char[] {'H', 'i'}), is(false));

    }
}
