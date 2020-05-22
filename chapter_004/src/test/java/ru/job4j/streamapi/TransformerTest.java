package ru.job4j.streamapi;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
public class TransformerTest {
    @Test
    public void whenConvertMatrixToList() {
        Integer[][] arr = {{1, 4, 9}, {90, 7, 16}};
        List<Integer> actual = Transformer.convertMatrixToList(arr);
        List<Integer> expected = List.of(1, 4, 9, 90, 7, 16);
        assertThat(actual, is(expected));
    }
}
