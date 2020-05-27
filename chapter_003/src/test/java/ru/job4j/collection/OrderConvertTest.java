package ru.job4j.collection;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class OrderConvertTest {
    @Test
    public void whenConvertListToMap() {
        List<Order> orders = List.of(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }
}
