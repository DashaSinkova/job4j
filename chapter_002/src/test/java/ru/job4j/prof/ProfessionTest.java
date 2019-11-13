package ru.job4j.prof;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class ProfessionTest {
    @Test
    public void programmerObjTest() {
        Programmer dasha = new Programmer("Дарья", "Синькова", "Высшее техническое",
                "27.02.1996", "Повседневный стиль", "IntellijIDEA",
                "Комплит", "Intern");
        assertThat(dasha.newProject(new Project("Курс Стажер 002ООП.2.3", "15.11.2019", "Создать классы и их методы, используя наследование", false)), is("Курс Стажер 002ООП.2.3"));
    }
    @Test
    public void dentistObjTest() {
        Dentist andrey = new Dentist("Андрей", "Оринчев", "Лечебное дело", "12.03.1991",
                "-", "зеркало, пинцет, зонд, шпатель", true);
        assertThat(andrey.heal(new Patient("Дарья", "Синькова", "27.02.1996",
                "Восполение зубов мудрости", "Удаление зубов с анастезией")), is("Восполение зубов мудрости, Удаление зубов с анастезией"));
    }

}
