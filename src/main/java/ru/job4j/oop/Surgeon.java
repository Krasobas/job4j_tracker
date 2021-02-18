package ru.job4j.oop;

public class Surgeon extends Doctor {
    private int[] scalpels;

    public Surgeon(int[] scalpels, boolean coat,
                   String name, String surname, String education, String birthday) {
        super(coat, name, surname, education, birthday);
        this.scalpels = scalpels;
    }

    public Surgeon(int[] scalpels) {
        this.scalpels = scalpels;
    }

    public Surgeon() {
    }

    private void cut() {
    }
}
