package com.thinkInJava.Chapter9;

import static com.thinkInJava.Chapter6.Print.print;

public class Music5 implements Instruments {

    public static void main(String[] args) {
        new Music5().play();
        print(Instruments.VALUE);
        Instruments ins = new Music5();
        new Music5().f(ins);
        new Music5().f(new Music5());
    }

    @Override
    public void play() {
        print(Instruments.VALUE);
        print("play()");
    }

    @Override
    public void adjust() {

    }

    public void f(Instruments instruments) {
        print("f()");
    }
}
