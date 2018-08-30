package com.thinkInJava.Chapter9;

public class WaveForm {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "WaveForm " + id;
    }
}
