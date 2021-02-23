package ru.job4j.poly;

public class Bus implements Transport {
    private String[] stops = {"School", "Hospital", "University", "Library", "City center"};
    private int passengers = 0;
    private int count = 0;
    private int gas = 200;
    private boolean direction = true;

    @Override
    public void go() {
        System.out.println("Attention please! Door are closing. The next station is "
                + stops[count]);
        if (direction && count < stops.length - 1) {
            count++;
        } else {
            direction = false;
            count--;
            direction = count == 0;
        }
        gas -= 5;
        if (gas < 10) {
            System.out.println("Gas is exhausted!");
        }
    }

    @Override
    public void pickUp(int passengers) {
        this.passengers += passengers;
        if (this.passengers < 50) {
            System.out.println("Welcome on the board!");
        } else {
            System.out.println("Sorry, there is no place in the bas!");
        }
    }

    @Override
    public int fillUp(int gas) {
        this.gas = gas;
        return gas * 50;
    }
}
