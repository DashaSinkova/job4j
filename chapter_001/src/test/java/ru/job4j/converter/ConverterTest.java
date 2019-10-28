package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = (int) Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        Assert.assertEquals(0, (int) Converter.rubleToDollar(0));
    }

    @Test
    public void dollarToRubles() {
        Assert.assertEquals(120, Converter.dollarToRuble(2));
    }
    @Test
    public void euroToRubles() {
        Assert.assertEquals(140, Converter.euroToRuble(2));
    }

}
