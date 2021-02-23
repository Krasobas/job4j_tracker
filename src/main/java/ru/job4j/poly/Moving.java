package ru.job4j.poly;

public class Moving {
    public static void main(String[] args) {
        Vehicle bus1 = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle train1 = new Train();
        Vehicle train2 = new Train();
        Vehicle plane1 = new Airplane();
        Vehicle plane2 = new Airplane();
        Vehicle[] transport = {bus1, bus2, train1, train2, plane1, plane2};
        for (Vehicle vehicle : transport) {
            vehicle.move();
            vehicle.stop();
        }
    }
}
