package ru.job4j.oop;

public class Student extends Object {

    public void music() {
        System.out.println("Tra tra tra");
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        for (int index = 0; index < 6; index++) {
            if (index < 3) {
                petya.music();
            } else {
                petya.song();
            }
        }
    }
}
