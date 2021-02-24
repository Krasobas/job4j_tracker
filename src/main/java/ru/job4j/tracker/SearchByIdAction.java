package ru.job4j.tracker;

public class SearchByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        int id = input.askInt("Enter Id of Item you would like to find: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("There is no any Item with this Id in the Tracker.");
        }
        return true;
    }
}

