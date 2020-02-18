package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
            String name = input.askStr("Enter name: ");
            tracker.replace(id, new Item(name));
            System.out.println("Editing Successful");

        return true;
    }
}
