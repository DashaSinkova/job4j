package ru.job4j.condition;
import org.junit.*;

public class SqAreaTest {
    @Test
    public void square(){
        Assert.assertEquals(2,SqArea.square(6,2),0.01);
        Assert.assertEquals(1.1,SqArea.square(4,1),0.11);
    }
}
