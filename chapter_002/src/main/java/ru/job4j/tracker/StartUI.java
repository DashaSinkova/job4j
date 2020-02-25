/**
 * 2.1. Реализация класса StartUI[#188284]
 * 4.2. Статические методы.[#188295]
 */
package ru.job4j.tracker;
public class StartUI {
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            System.out.println();
                int select = input.askInt("Select: ", actions.length);
                UserAction action = actions[select];
                run = action.execute(input, tracker);
        }
    }
        private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
           for (int i = 0; i < actions.length; i++) {
               System.out.println(i + ". " + actions[i].name());
           }
        }
        public static void main(String[]args) {
            Input validate = new ValidateInput();
            Tracker tracker = new Tracker();
            UserAction[] actions = {
                    new CreateAction(),
                    new ShowAllitemsAction(),
                    new ReplaceAction(),
                    new DeleteAction(),
                    new FindByIdAction(),
                    new FindItemsByNameAction()};
            new StartUI().init(validate, tracker, actions);
        }
    }

