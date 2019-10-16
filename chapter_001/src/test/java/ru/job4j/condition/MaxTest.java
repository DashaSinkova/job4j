package ru.job4j.condition;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenLeftMax(){
        assertThat(Max.max(2,10),is(10));
    }

    @Test
    public void whenRightMax(){
        assertThat(Max.max(10,2),is(10));
    }
    @Test
    public void whenBothAreEqual(){
        assertThat(Max.max(2,2),is(2));
    }
}
