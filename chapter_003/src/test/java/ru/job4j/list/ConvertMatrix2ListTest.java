package ru.job4j.list;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class ConvertMatrix2ListTest {
    @Test
    public void whenConvertMatrix2List() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        List<Integer> actual = list.toList(new int[][]{
                {1, 2},
                {3, 4}
        });
        assertThat(actual, is(Arrays.asList(1, 2, 3, 4)));
    }
}
