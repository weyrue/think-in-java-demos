package com.thinkInJava.Chapter19;

public class EvenGenerator extends IntGenerator {
    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }

    private int currentEvenValue = 0;

    @Override
    public synchronized int next() {
        try {
            ++currentEvenValue;
            Thread.yield();
            ++currentEvenValue;
            return currentEvenValue;
        } finally {
//            System.out.println("finally");
        }
    }
}
