package com.thinkInJava.Chapter7;

import static com.thinkInJava.Chapter6.Print.print;

public class Beetles {
    public static void main(String[] args) {
        new Beetle();
        new Beetle();
    }
}

class Insect {
    private int j = f("Insect j initiate.");
    private static int i = f("Insect i initiate.");

    public static int f(String s) {
        print(s);
        return 13;
    }

    public static int g() {
        print("Insect g() initiate.");
        return 13;
    }

    public Insect() {
        print("Insect Constructor.");
    }
}

class Beetle extends Insect {
    private int j = f("Beetle j initiate.");
    private static int i = f("Beetle i initiate.");

    public Beetle() {
        print("Beetle Constructor.");
    }
}
