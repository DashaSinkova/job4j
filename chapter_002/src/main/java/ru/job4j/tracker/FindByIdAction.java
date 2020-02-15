package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        name();
        System.out.println(" If you want to exit enter \"exit\".");
        try {
            String id = input.askStr("Enter id: ");
            if (!id.equalsIgnoreCase("exit")) {
                Item item = tracker.findById(id);
                System.out.println(" Successful! " + System.lineSeparator() + item.getId() + " " + item.getName());
            }
        } catch (NullPointerException e) {

        }
        return true;
    }
}
