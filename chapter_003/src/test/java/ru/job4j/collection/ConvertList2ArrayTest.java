package ru.job4j.collection;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertList2ArrayTest {
    @Test
    public void whenConvertToMas() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] expected = {{1, 2, 3}, {4, 5, 6}, {7, 0, 0}};
        assertThat(ConvertList2Array.toArray(list, 3), is(expected));
    }
}
