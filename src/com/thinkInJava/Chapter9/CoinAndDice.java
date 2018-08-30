package com.thinkInJava.Chapter9;

import java.util.Random;

import static com.thinkInJava.Chapter6.Print.print;

public class CoinAndDice {
    public static void playGamble(GambleFactory factory) {
        factory.getGamble().showResult();
    }

    public static void main(String[] args) {
        int i = 10;
        while (i-- > 0) {
            playGamble(new CoinGameFactory());
        }

        print();

        int j = 10;
        while (j-- > 0) {
            playGamble(new DiceGameFactory());
        }
    }
}

interface Gamble {
    void showResult();
}

interface GambleFactory {
    Gamble getGamble();
}

class CoinGame implements Gamble {
    @Override
    public void showResult() {
        Random random = new Random();
        print("Coin shows " + random.nextInt(2));
    }
}

class CoinGameFactory implements GambleFactory {
    @Override
    public Gamble getGamble() {
        return new CoinGame();
    }
}

class DiceGame implements Gamble {
    @Override
    public void showResult() {
        Random random = new Random();
        print("Dice shows " + (1 + random.nextInt(6)));
    }
}

class DiceGameFactory implements GambleFactory {
    @Override
    public Gamble getGamble() {
        return new DiceGame();
    }
}

