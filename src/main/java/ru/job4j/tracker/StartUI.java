package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item first = new Item();
        Item second = new Item();
        Item third = new Item();
        Item temp;
        Item[] names;
        first.setName("ivanov");
        second.setName("petrov");
        third.setName("ivanov");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(first.getCreated().format(formatter));
        System.out.println("Find by id:");
        temp = tracker.findById(1);
        System.out.println("Id: " + temp.getId() + " Name: " + temp.getName());
        System.out.println("Find by name:");
        names = tracker.findByName("ivanov");
        for (Item name : names) {
            System.out.println("Id: " + name.getId() + " Name: " + name.getName());
        }
        System.out.println("Find all:");
        names = tracker.findAll();
        for (Item name : names) {
            System.out.println("Id: " + name.getId() + " Name: " + name.getName());
        }
        System.out.println("Print items:");
        System.out.println(first + "\n" + second + "\n" + third);
    }
}