package ru.job4j.stragery;
import org.junit.Test;

import java.util.StringJoiner;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class SquareTest {
    @Test
    public void whenSquare() {
        Square square = new Square();
        assertThat(square.draw(), is(new StringJoiner(System.lineSeparator())
                .add("+ + + +")
                .add("+     +")
                .add("+     +")
                .add("+ + + +").toString()));
    }

}
