package ru.job4j.oop.profession;

public class Surgeon extends Doctor {
    private int[] scalpels;

    public Surgeon(int[] scalpels, boolean coat,
                   String name, String surname, String education, String birthday) {
        super(coat, name, surname, education, birthday);
        this.scalpels = scalpels;
    }

    private void cut() {
    }
}
