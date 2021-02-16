package ru.job4j.oop;

public class Hare {
    private String name;

    public void tryEat(Ball ball) {
        System.out.println("Ok");
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public String getNick() {
        return this.name;
    }
}
