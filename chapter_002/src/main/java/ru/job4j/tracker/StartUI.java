/**
 * 2.1. Реализация класса StartUI[#188284]
 */
package ru.job4j.tracker;
import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            System.out.println();
            this.showMenu();
            System.out.println();
            System.out.print("Select: ");
            try {
                int select = Integer.valueOf(scanner.nextLine());
                if (select >= 0 && select < 7) {
                    if (select == 0) {
                        System.out.println("=== Create a new Item ====");
                        System.out.println(" If you want to exit enter \"exit\".");
                        boolean flag = false;
                        while (!flag) {
                            System.out.print("Enter name:");
                            String name = scanner.nextLine();
                            if (!name.equalsIgnoreCase("exit")) {
                                Item item = new Item(name);
                                tracker.add(item);
                                System.out.print("Item is created!");
                                flag = true;
                            }
                        }
                    } else if (select == 1) {
                        System.out.println("=== Show all items ====");
                        Item[] items = tracker.findAll();
                        if (items.length != 0) {
                            for (int i = 0; i < items.length; i++) {
                                System.out.println(items[i].getId() + " " + items[i].getName());
                            }
                        } else {
                            System.out.println("Array is empty");
                        }
                    } else if (select == 2) {
                        System.out.println("=== Edit item ====");
                        System.out.println(" If you want to exit enter \"exit\".");
                        boolean flag = false;
                        while (!flag) {
                            System.out.print("Enter id: ");
                            String id = scanner.nextLine();
                            if (id.equalsIgnoreCase("exit")) {
                                break;
                            }
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            if (tracker.replace(id, new Item(name))) {
                                System.out.println("Editing Successful");
                                flag = true;
                            }
                        }
                    } else if (select == 3) {
                        System.out.println("=== Delete item ====");
                        System.out.println(" If you want to exit enter \"exit\".");
                        boolean flag = false;
                        while (!flag) {
                            System.out.print("Enter id: ");
                            String id = scanner.nextLine();
                            if (!id.equalsIgnoreCase("exit")) {
                                if (tracker.delete(id)) {
                                    System.out.println("Deleted completed successfully");
                                    flag = true;
                                }
                            } else {
                                flag = true;
                            }
                        }
                    } else if (select == 4) {
                        System.out.println("=== Find item by Id ====");
                        System.out.println(" If you want to exit enter \"exit\".");
                        boolean flag = false;
                        while (!flag) {
                            try {
                                System.out.print("Enter id: ");
                                String id = scanner.nextLine();
                                if (!id.equalsIgnoreCase("exit")) {
                                    Item item = tracker.findById(id);
                                    System.out.println(" Successful! " + System.lineSeparator() + item.getId() + " " + item.getName());
                                    flag = true;
                                } else {
                                    flag = true;
                                }
                            } catch (NullPointerException e) {

                            }
                        }
                    } else if (select == 5) {
                        System.out.println("=== 5. Find items by name ====");
                        System.out.println(" If you want to exit enter \"exit\".");
                        boolean flag = false;
                        while (!flag) {
                                System.out.print("Enter name: ");
                                String name = scanner.nextLine();
                                if (!name.equalsIgnoreCase("exit")) {
                                    Item[] arr = tracker.findByName(name);
                                    if (arr.length != 0) {
                                        System.out.println(" Successful! ");
                                        for (int i = 0; i < arr.length; i++) {
                                            System.out.println(arr[i].getId() + " " + arr[i].getName());
                                        }
                                        flag = true;
                                    } else {
                                        System.out.println("Array is empty or you input incorrect symbol");
                                        System.out.println("Please, try again");
                                    }
                                } else {
                                    flag = true;
                                }
                        }
                    } else if (select == 6) {
                        run = false;
                    }
                } else {
                    System.out.println("Please, enter the correct number between 0 and 6");
                }

            } catch (Exception e) {
                System.out.println("Please, enter the correct number between 0 and 6");
            }
        }
    }
        private void showMenu () {
            System.out.println("Menu.");
            System.out.println("0. Add new Item");
            System.out.println("1. Show all items");
            System.out.println("2. Edit item");
            System.out.println("3. Delete item");
            System.out.println("4. Find item by Id");
            System.out.println("5. Find items by name");
            System.out.println("6. Exit Program");
        }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            Tracker tracker = new Tracker();
            new StartUI().init(scanner, tracker);
        }
    }

