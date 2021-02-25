package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] all = tracker.findAll();
        out.println("=== All Items of the Tracker ====");
        if (all.length > 0) {
            for (Item item : all) {
                out.println(item);
            }
        } else {
            out.println("There is no any Item in the Tracker.");
        }
        return true;
    }
}
