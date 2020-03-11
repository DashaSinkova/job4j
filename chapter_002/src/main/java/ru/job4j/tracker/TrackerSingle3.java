package ru.job4j.tracker;

public class TrackerSingle3 {
    private static final TrackerSingle3 INSTANCE = new TrackerSingle3();
    private Tracker tracker = new Tracker();
    private TrackerSingle3() {

    }
    public static TrackerSingle3 getInstance() {
        return INSTANCE;
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
