package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Осторожно двери закрываются!");
    }

    @Override
    public void stop() {
        System.out.println("Время остановки 30 минут.");
    }
}
