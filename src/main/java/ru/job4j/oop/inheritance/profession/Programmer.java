package ru.job4j.oop.inheritance.profession;

public class Programmer extends Engineer {
    private int tasks;
    private String computer;

    public Programmer(int tasks, String computer, boolean glasses, String name,
                      String surname, String education, String birthday) {
        super(glasses, name, surname, education, birthday);
        this.tasks = tasks;
        this.computer = computer;
    }

    private void writeCode() {
    }

    private void fixBug() {
    }
}
