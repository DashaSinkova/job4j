package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println(" If you want to exit enter \"exit\".");
        String id = input.askStr("Enter id: ");
        if (!id.equalsIgnoreCase("exit")) {
            if (tracker.delete(id)) {
                System.out.println("Deleted completed successfully");
            }
        }
        return true;
    }
}
