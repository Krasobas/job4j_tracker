package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String question;
        String[] answers = {"Yes!", "No!", "Maybe."};
        int random = new Random().nextInt(3);
        System.out.println("Hello, I'm a Great Oracle! What would you like to know?\n"
                + "Please, enter a yes/no question:\n");
        question = input.nextLine();
        System.out.println(answers[random]);
    }
}
