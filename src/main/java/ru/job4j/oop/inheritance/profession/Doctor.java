package ru.job4j.oop.inheritance.profession;

public class Doctor extends Profession {
    private boolean coat;

    public Doctor(boolean coat, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.coat = coat;
    }

    public void examinePassion(Patient patient) {
    }
}
