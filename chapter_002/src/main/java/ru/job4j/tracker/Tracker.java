package ru.job4j.tracker;
import java.util.Random;
import java.util.Arrays;
/**
 * 5. Реализовать класс Tracker[#188330]
 * написать тесты на все методы
 */
public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;
    /**
     * @return
     * добавление заявок
     */
    public Item add(Item item) {
        item.setId(this.generateId());
            this.items[position++] = item;
        return item;
    }
    /**
     * Редактирование заявок
     *
     * Ищем по данному id индекс ячейки с этим id
     * Устанавливаем item(у) id ячейки с найденым индексом
     * Добавляем item в ячейку массиву
     */
    public boolean replace(String id, Item item) {
        boolean res = false;
        int i = this.getIndexById(id);
        if (i >= 0) {
            item.setId(items[i].getId());
            this.items[i] = item;
            res = true;
        }
        return res;
    }
    /**
     * удаление заявок
     */
    public boolean delete(String id) {
        boolean res = false;
        int index = this.getIndexById(id);
        if (index >= 0) {
            System.arraycopy(items, index + 1, items, index, this.items.length - index - 1);
            items[this.items.length - 1] = null;
            position--;
            res = true;
        }
        return res;
    }
    /**
     * получение списка всех заявок
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }
    /**
     * получение списка по имени
     * @param key
     * @return
     */
    public Item[] findByName(String key) {
        Item[] arr = new Item[position];
        int count = 0;
           for (int i = 0; i < position; i++) {
           if (items[i].getName().equalsIgnoreCase(key)) {
               arr[count] = items[i];
               count++;
           }
       }
        return Arrays.copyOf(arr, count);
    }
    /**
     *получение заявки по id
     * @param id
     * @return
     */
    public Item findById(String id) {
        Item item = null;
        int i = this.getIndexById(id);
        if (i >= 0) {
            item = items[i];
        }
            return item;
        }
    /**
     * метод генерирует случайное значение id в виде произвольного числа и времени
     * @return
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
    /**
     * Поиск индекса по ID элемента массива
     * @param id
     * @return индекс элемента массива, id которого равно @param
     */
    private int getIndexById(String id) {
        int index = -1;
            for (int i = 0; i < position; i++) {
                if (items[i].getId().equals(id)) {
                    index = i;
                    break;
                }
            }
        return index;
    }
}
