package ru.job4j.pojo;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class LicenseTest {
    @Test
    public void equalsObject() {
        License first = new License();
        License second = new License();
        first.setCode("audio");
        second.setCode("audio");
        assertThat(first, is(second));
    }
}
