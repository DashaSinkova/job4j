package ru.job4j.tracker;

/**
 * 1. Singleton.[#188304]
 */

public class TrackerSingle1 {
    private static TrackerSingle1 instance;
    private Tracker tracker = new Tracker();

    private TrackerSingle1() {

    }
    public static TrackerSingle1 getInstance() {
        if (instance == null) {
            instance = new TrackerSingle1();
        }
        return instance;
    }

    public Item add(Item model) {
        return tracker.add(model);
    }
    public boolean replace(String id, Item item) {
        return tracker.replace(id, item);
    }
    /**
     * удаление заявок
     */
    public boolean delete(String id) {

        return tracker.delete(id);
    }
    /**
     * получение списка всех заявок
     */
    public Item[] findAll() {
        return tracker.findAll();
    }
    /**
     * получение списка по имени
     * @param key
     * @return
     */
    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }
    /**
     *получение заявки по id
     * @param id
     * @return
     */
    public Item findById(String id) {

        return tracker.findById(id);
    }
}
