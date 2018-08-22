package com.thinkInJava.Chapter7;

public class BlankFinal {
    private final int i = 0;
    private final int j;
    //    private int j;
    private Poppet p;

    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
    }

    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
    }

//    public void changeFinalData() {
//        j = 2;
//    }

    public static void main(String[] args) {

    }
}

class Poppet {
    private int i;

    Poppet(int i) {
        this.i = i;
    }
}
