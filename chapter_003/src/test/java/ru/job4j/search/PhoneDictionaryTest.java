package ru.job4j.search;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import java.util.ArrayList;

public class PhoneDictionaryTest {
    @Test
    public void whenKeyContains() {
        var persons = new PhoneDictionary();
        persons.add(new Person("Dasha", "Sinkova", "8343419", "Spb"));
        var res = persons.find("341");
        assertThat(res.get(0).getName(), is("Dasha"));
    }
}
