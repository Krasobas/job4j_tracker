package ru.job4j.tracker;

public class SearchByNameAction implements UserAction {
    private final Output out;

    public SearchByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ====");
        String name = input.askStr("Enter the name of Items you would like to find: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("There is no any Item with this name in the Tracker.");
        }
        return true;
    }
}

