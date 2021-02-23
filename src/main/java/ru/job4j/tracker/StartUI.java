package ru.job4j.tracker;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAll(Tracker tracker) {
        System.out.println("=== All Items of the Tracker ====");
        Item[] all = tracker.findAll();
        if (all.length > 0) {
            for (Item item : all) {
                System.out.println(item);
            }
        } else {
            System.out.println("There is no any Item in the Tracker.");
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        int id = input.askInt("Enter Id of Item you would like to edit: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item was successfully edited!");
        } else {
            System.out.println("Something went wrong, try again!");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        int id = input.askInt("Enter Id of Item you would like to delete: ");
        if (tracker.delete(id)) {
            System.out.println("Item was successfully deleted!");
        } else {
            System.out.println("Something went wrong, try again!");
        }
    }

    public static void searchById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ====");
        int id = input.askInt("Enter Id of Item you would like to find: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("There is no any Item with this Id in the Tracker.");
        }
    }

    public static void searchByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ====");
        String name = input.askStr("Enter the name of Items you would like to find: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("There is no any Item with this name in the Tracker.");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAll(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.searchById(input, tracker);
            } else if (select == 5) {
                StartUI.searchByName(input, tracker);
            } else if (select == 6) {
                System.out.println("Goodbye!");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu."
        + System.lineSeparator() + "0. Add new Item"
        + System.lineSeparator() + "1. Show all items"
        + System.lineSeparator() + "2. Edit item"
        + System.lineSeparator() + "3. Delete item"
        + System.lineSeparator() + "4. Find item by Id"
        + System.lineSeparator() + "5. Find items by name"
        + System.lineSeparator() + "6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}