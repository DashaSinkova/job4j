package ru.job4j.tracker;

public class ShowAllitemsAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        name();
        Item[] items = tracker.findAll();
        if (items.length != 0) {
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i].getId() + " " + items[i].getName());
            }
        } else {
            System.out.println("Array is empty");
        }
        return true;
    }
}
