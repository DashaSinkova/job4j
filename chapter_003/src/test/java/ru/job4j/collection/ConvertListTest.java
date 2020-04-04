package ru.job4j.collection;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class ConvertListTest {
    @Test
    public void whenConvert2mas() {
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1});
        list.add(new int[]{2, 3});
        List<Integer> exp = Arrays.asList(1, 2, 3);
        assertThat(ConvertList.convert(list), is(exp));
    }
}
