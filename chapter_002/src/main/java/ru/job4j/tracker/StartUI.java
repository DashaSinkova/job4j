/**
 * 2.1. Реализация класса StartUI[#188284]
 * 4.2. Статические методы.[#188295]
 */
package ru.job4j.tracker;
public class StartUI {
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            System.out.println();
            this.showMenu(actions);
            System.out.println();
            try {
                int select = input.askInt("Select: ");
                UserAction action = actions[select];
                run = action.execute(input, tracker);
            } catch (Exception e) {
                System.out.println("Please, enter the correct number between 0 and 6");
            }
        }
    }
        private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
           for (int i = 0; i < actions.length; i++) {
               System.out.println(i + ". " + actions[i].name());
           }
        }
        public static void main(String[]args) {
            Input input = new ConsoleInput();
            Tracker tracker = new Tracker();
            UserAction[] actions = {
                    new CreateAction(),
                    new ShowAllitemsAction(),
                    new ReplaceAction(),
                    new DeleteAction(),
                    new FindByIdAction(),
                    new FindItemsByNameAction()};
            new StartUI().init(input, tracker, actions);
        }
    }

