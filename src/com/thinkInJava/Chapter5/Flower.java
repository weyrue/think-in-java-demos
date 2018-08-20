package com.thinkInJava.Chapter5;

public class Flower {
    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }

    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constuctor w/ int arg only, petalCount = " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constuctor w/ String arg only, s = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        this.s = s;
//        this(s);
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("Default constructor (no args)");
    }

    void printPetalCount() {
        System.out.println("PetalCount = " + petalCount + " s = " + s);
    }
}
