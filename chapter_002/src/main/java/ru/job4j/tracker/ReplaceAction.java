package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(" If you want to exit enter \"exit\".");
        String id = input.askStr("Enter id: ");
        if (!id.equalsIgnoreCase("exit")) {
            String name = input.askStr("Enter name: ");
            if (tracker.replace(id, new Item(name))) {
                System.out.println("Editing Successful");
            }
        }
        return true;
    }
}
