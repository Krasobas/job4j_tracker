package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        int id = input.askInt("Enter Id of Item you would like to edit: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item was successfully edited!");
        } else {
            System.out.println("Something went wrong, try again!");
        }
        return true;
    }
}
