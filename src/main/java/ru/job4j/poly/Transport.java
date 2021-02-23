package ru.job4j.poly;

public interface Transport {
    void go();

    void pickUp(int passengers);

    int fillUp(int gas);
}
