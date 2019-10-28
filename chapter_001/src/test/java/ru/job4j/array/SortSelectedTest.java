package ru.job4j.array;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SortSelectedTest {
    @Test
    public void whenSort34125() {
        assertThat(SortSelected.sort(new int[]{3, 4, 1, 2, 5}), is(new int[]{1, 2, 3, 4, 5}));

    }
    @Test
    public void whenSort202130() {
        assertThat(SortSelected.sort(new int[]{21, 20, 30}), is(new int[]{20, 21, 30}));

    }
}
