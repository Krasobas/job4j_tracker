package ru.job4j.oop;

public class Doctor extends Profession {
    private boolean coat;

    public Doctor(boolean coat, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.coat = coat;
    }

    public Doctor(boolean coat) {
        this.coat = coat;
    }

    public Doctor() {
    }

    public void examinePassion(Patient patient) {
    }
}
