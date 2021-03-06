package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches >= 1 && matches <= 3) {
                while (matches > count) {
                    System.out.println("Вы ввели " + matches + ", но осталось всего "
                            + count + " спички." + System.lineSeparator()
                            + "Попробуйте еще раз!" + System.lineSeparator()
                            + "Введите число от 1 до " + count);
                    matches = Integer.parseInt(input.nextLine());
                }
                turn = !turn;
                count -= matches;
                System.out.println("Осталось " + count + " спичек.");
            } else {
                System.out.println("Воу-воу! Не жульничайте! Только от 1 до 3!");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
