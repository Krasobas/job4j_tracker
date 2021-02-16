package ru.job4j.oop;

public class Fox {
    private String name;

    public void tryEat(Ball ball) {
        System.out.println("nyam-nyam");
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public String getNick() {
        return this.name;
    }
}
