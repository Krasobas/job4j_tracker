package ru.job4j.oop.inheritance.profession;

public class Builder extends Engineer {
    private boolean helmet;

    public Builder(boolean helmet, boolean glasses, String name,
                   String surname, String education, String birthday) {
        super(glasses, name, surname, education, birthday);
        this.helmet = helmet;
    }

    private void build() {
    }
}
