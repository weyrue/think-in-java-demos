package com.thinkInJava.Chapter6;

public class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("Cartoon Constructor.");
    }

    public static void main(String[] args) {
        // write your code here
        Cartoon x = new Cartoon();
    }
}

class Art {
    Art() {
        System.out.println("Art Constructor.");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing Constructor.");
    }
}


