package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        String[] questions = {"Study Java", "1"};
        Input input = new StubInput(questions);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item(questions[0]);
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        String[] questions = {"Study Java", "1", "Study programming"};
        Input input = new StubInput(questions);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        StartUI.replaceItem(input, tracker);
        Item replaced = tracker.findById(1);
        Item expected = new Item(questions[2]);
        assertThat(replaced.getName(), is(expected.getName()));
    }

    @Test
    public void whenReplaceItemPro() {
        Item item = new Item();
        Tracker tracker = new Tracker();
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), "replaced Item"};
        StartUI.replaceItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is(answers[1]));
    }

    @Test
    public void whenDeleteItem() {
        String[] questions = {"Study Java", "1"};
        Input input = new StubInput(questions);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        StartUI.deleteItem(input, tracker);
        Item[] deleted = tracker.findAll();
        Item[] expected = new Item[0];
        assertThat(deleted.length, is(expected.length));
    }

    @Test
    public void whenDeleteItemPro() {
        Item item = new Item();
        Tracker tracker = new Tracker();
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), "deleted"};
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        assertThat(deleted, is(nullValue()));

    }
}