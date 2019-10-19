package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist(){
        assertThat(Triangle.exist(2,2,2),is(true));
    }
    @Test
    public void whenDoesntExist(){
        assertThat(Triangle.exist(2,100,1),is(false));
    }

}