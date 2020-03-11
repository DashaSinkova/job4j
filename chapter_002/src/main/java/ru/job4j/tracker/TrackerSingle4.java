package ru.job4j.tracker;
/**
 * 1. Singleton.[#188304]
 */
public class TrackerSingle4 {
    private Tracker tracker = new Tracker();
    private TrackerSingle4() {

    }
    public static TrackerSingle4 getInstance() {
        return Holder.INSTANCE;
    }
    private static final class Holder {
        private static final TrackerSingle4 INSTANCE = new TrackerSingle4();
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
