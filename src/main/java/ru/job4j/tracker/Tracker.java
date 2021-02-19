package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] all = new Item[size];
        int length = 0;
        for (int index = 0; index < size; index++) {
            if (items[index] != null) {
                all[length++] = items[index];
            }
        }
        return Arrays.copyOf(all, length);
    }

    public Item[] findByName(String key) {
        Item[] keys = new Item[size];
        int length = 0;
        for (int index = 0; index < size; index++) {
            String temp = items[index].getName();
            if (temp.equals(key)) {
                keys[length++] = items[index];
            }
        }
        return Arrays.copyOf(keys, length);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}