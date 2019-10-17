package ru.job4j.condition;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SqAreaTest{
    @Test
    public void whenP4k1s1(){
        assertThat(SqArea.square(4,1),is(1));
    }
    @Test
    public void whenP6k2s2(){
        assertThat(SqArea.square(6,2),is(2));
    }
}

