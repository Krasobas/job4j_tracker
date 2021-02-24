package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        int id = input.askInt("Enter Id of Item you would like to delete: ");
        if (tracker.delete(id)) {
            System.out.println("Item was successfully deleted!");
        } else {
            System.out.println("Something went wrong, try again!");
        }
        return true;
    }
}
