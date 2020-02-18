package ru.job4j.tracker;

public class FindItemsByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
            Item[] arr = tracker.findByName(name);
            if (arr.length != 0) {
                System.out.println(" Successful! ");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i].getId() + " " + arr[i].getName());
                }
            } else {
                System.out.println("Array is empty or you input incorrect symbol");
                System.out.println("Please, try again");
            }

        return true;
    }
}
