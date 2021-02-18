package ru.job4j.oop.inheritance.profession;

public class Dentist extends Doctor {
    private int[] drills;
    private int anaesthetic;

    public Dentist(int[] drills, int anaesthetic, boolean coat,
                   String name, String surname, String education, String birthday) {
        super(coat, name, surname, education, birthday);
        this.drills = drills;
        this.anaesthetic = anaesthetic;
    }

    public void startDrill() {
    }

    public void giveAnaesthetic() {
    }
}
