package ru.job4j.array;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class MinTest {
    @Test
    public void whenFirstMin(){
        assertThat(Min.findMin(new int[]{0,10,2,31,3,2}),is(0));
    }
    @Test
    public void whenSecondMin(){
        assertThat(Min.findMin(new int[]{10,1,2,31,3,2}),is(1));
    }
    @Test
    public void whenMinThird(){
        assertThat(Min.findMin(new int[]{10,1,-2,31,3,2}),is(-2));
    }

}
