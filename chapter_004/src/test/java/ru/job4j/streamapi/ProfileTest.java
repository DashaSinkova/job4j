package ru.job4j.streamapi;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
public class ProfileTest {
    @Test
    public void whenProfileAddressSearch() {
        List<Profile> profiles = List.of(new Profile(new Address("Москва", "Ленина", 154, 24)),
                new Profile(new Address("Москва", "Гагарина", 93, 874)),
                new Profile(new Address("Санкт-Петербург", "Савушкина", 18, 84)));
        List<Address> expected = List.of(new Address("Москва", "Ленина", 154, 24),
        new Address("Москва", "Гагарина", 93, 874),
                new Address("Санкт-Петербург", "Савушкина", 18, 84));
        assertThat(Profiles.collect(profiles).toString(), is(expected.toString()));
    }
}
