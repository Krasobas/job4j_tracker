package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete item ====");
        int id = input.askInt("Enter Id of Item you would like to delete: ");
        if (tracker.delete(id)) {
            out.println("Item was successfully deleted!");
        } else {
            out.println("Something went wrong, try again!");
        }
        return true;
    }
}
