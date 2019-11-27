package ru.job4j.tracker;
import com.sun.tools.jdi.EventSetImpl;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
/**
 * 5. Реализовать класс Tracker[#188330]
 * написать тесты на все методы
 */
public class TrackerTest {
    @Test
    public void deleteTest() {
        Tracker sc = new Tracker();
        Item addItem1 = sc.add(new Item("Оборудование HP"));
        Item addItem2 = sc.add(new Item("Оборудование HPE"));
        assertThat(sc.findAll(), is(new Item[]{addItem1, addItem2}));
        assertThat(sc.delete(addItem1.getId()), is(true));
        assertThat(sc.findAll(), is(new Item[]{addItem2}));
    }
    @Test
    public void findAllTest() {
        Tracker sc = new Tracker();
        Item addItem1 = sc.add(new Item("Оборудование HP"));
        Item addItem2 = sc.add(new Item("Оборудование HPE"));
        assertThat(sc.findAll(), is(new Item[]{addItem1, addItem2}));
    }
    @Test
    public void addTest() {
        Tracker sc = new Tracker();
        Item item = new Item("Оборудование HP");
        assertThat(sc.add(item).getName(), is(item.getName()));
    }
    @Test
    public void replaceTest() {
        Item res = new Item("Оборудование HP");
        Tracker sc = new Tracker();
        Item addItem = sc.add(new Item("Оборудование HPE"));
        res.setId(addItem.getId());
        sc.replace(addItem.getId(), res);
        assertThat(sc.findById(addItem.getId()).getName(), is("Оборудование HP"));
    }
    @Test
    public void findByIdTest() {
        Tracker sc = new Tracker();
        Item addItem = sc.add(new Item("Оборудование HPE"));
        assertThat(sc.findById(addItem.getId()).getName(), is(addItem.getName()));
    }
    @Test
    public void findByNameTest() {
        Tracker sc = new Tracker();
        Item addItem0 = sc.add(new Item("Оборудование HPE"));
        Item addItem1 = sc.add(new Item("Оборудование HPE"));
        Item addItem2 = sc.add(new Item("Оборудование HP"));
        assertThat(sc.findByName(addItem0.getName()), is(new Item[]{addItem0, addItem1}));
    }
}
