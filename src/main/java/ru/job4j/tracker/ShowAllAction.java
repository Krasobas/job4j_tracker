package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] all = tracker.findAll();
        System.out.println("=== All Items of the Tracker ====");
        if (all.length > 0) {
            for (Item item : all) {
                System.out.println(item);
            }
        } else {
            System.out.println("There is no any Item in the Tracker.");
        }
        return true;
    }
}
