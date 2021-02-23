package ru.job4j.poly;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Пристигните ремни, мы взлетаем!");
        System.out.println("Мы летим");
        System.out.println("Убрать шасси.");
        System.out.println("Можете расстегнуть ремни.");
    }

    @Override
    public void stop() {
        System.out.println("Пристигните ремни, мы снижаемся!");
        System.out.println("Опустить шасси.");
        System.out.println("Мы приземлились.");
        System.out.println("Можете расстегнуть ремни.");
    }
}
