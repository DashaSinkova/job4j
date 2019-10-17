package ru.job4j.condition;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SqMaxTest {
    @Test
    public void whenFirstMax(){
        assertThat(SqMax.max(30,4,23,12),is(30));
    }
    @Test
    public void whenSecondMax(){
        assertThat(SqMax.max(30,40,23,12),is(40));
    }
    @Test
    public void whenThirdMax(){
        assertThat(SqMax.max(30,4,123,12),is(123));
    }
    @Test
    public void whenForthMax(){
        assertThat(SqMax.max(30,4,23,120),is(120));
    }
}
