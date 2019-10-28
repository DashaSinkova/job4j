package ru.job4j.array;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;


public class MatrixTest {
    Matrix m = new Matrix();
    @Test
    public void when2on2() {
        assertThat(m.multiple(2), is(new int[][]{
                {1, 2},
                {2, 4}
        }));

    }
    @Test
    public void when5on5() {
        assertThat(m.multiple(5), is(new int[][]{
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20 },
                {5, 10, 15, 20, 25}
        }));

    }

}
