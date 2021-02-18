package ru.job4j.oop.inheritance.profession;

public class Engineer extends Profession {
    private boolean glasses;

    public Engineer(boolean glasses, String name, String surname,
                    String education, String birthday) {
        super(name, surname, education, birthday);
        this.glasses = glasses;
    }

    public void wearGlasses() {
    }

    public void drinkCoffee() {
    }
}
