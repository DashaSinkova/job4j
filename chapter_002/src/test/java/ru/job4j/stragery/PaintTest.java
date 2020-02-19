package ru.job4j.stragery;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    // получаем ссылку на стандартный вывод в консоль.
    private final PrintStream stdout = System.out;
    // Создаем буфер для хранения вывода.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    @Before
    public void loadOutput() {
        //Заменяем стандартный вывод на вывод в пямять для тестирования.
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));

    }
    @After
    public void backOutput() {
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }
    @Test
    public void whenDrawSquare() {
        // выполняем действия пишущие в консоль.
        new Paint().draw(new Square());
        // проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("+ + + +")
                                .add("+     +")
                                .add("+     +")
                                .add("+ + + +")
                                .toString()));
    }
    @Test
    public void whenTrianglePrint() {
        new Paint().draw(new Triangle());
        assertThat(new String(out.toByteArray()), is(new StringJoiner(System.lineSeparator())
                .add("   + ")
                .add("  + + ")
                .add(" +   +")
                .add("+ + + + ")
                .toString()));
       }
}
