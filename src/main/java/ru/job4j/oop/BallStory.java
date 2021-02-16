package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.giveNick("Hare");
        ball.ask(hare.getNick());
        hare.tryEat(ball);
        wolf.giveNick("Wolf");
        ball.ask(wolf.getNick());
        wolf.tryEat(ball);
        fox.giveNick("Fox");
        ball.ask(fox.getNick());
        fox.tryEat(ball);
    }
}
