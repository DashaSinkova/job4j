package ru.job4j.calculator;
import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void manWeight() {
        Assert.assertEquals(92, Fit.manWeight(180), 0.01);
    }
    @Test
    public void womanWeight() {
        Assert.assertEquals(80, Fit.womanWeight(180), 0.5);
        Assert.assertEquals(80.4, Fit.womanWeight(180), 0.1);
    }

}
