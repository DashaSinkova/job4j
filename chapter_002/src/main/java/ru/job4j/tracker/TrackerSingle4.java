package ru.job4j.tracker;
/**
 * 1. Singleton.[#188304]
 */
public class TrackerSingle4 {
    private TrackerSingle4() {

    }
    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }
    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }

}
