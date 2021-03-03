package ru.job4j.ooa;

public class Aircraft {
/*  Ошибка: необходимо убрать модификатор final, т.к в противном случае мы не сможем
    перегрузить его в наследниках данного класса
    public final void printModel() {
        System.out.println("Метод выводит в консоль модель самолета.");
    }*/
    public void printModel() {
        System.out.println("Метод выводит в консоль модель самолета.");
    }
}
