package ru.job4j.array;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.area.MatrixCheck;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class MatrixCheckTest {
    MatrixCheck mc = new MatrixCheck();
    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };

        assertThat(mc.isWin(input), is(false));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };

        assertThat(mc.isWin(input), is(false));
    }
    @Test
    public void whenDataMonoByTrueThenTrue2() {
        char[][] input = {
                {'X', 'X', ' ', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
        };

        assertThat(mc.isWin(input), is(false));
    }
}