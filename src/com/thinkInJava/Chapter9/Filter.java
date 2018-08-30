package com.thinkInJava.Chapter9;

public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public WaveForm process(WaveForm input) {
        return input;
    }
}
