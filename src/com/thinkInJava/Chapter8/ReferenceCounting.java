package com.thinkInJava.Chapter8;

import static com.thinkInJava.Chapter6.Print.print;

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)};
        for (Composing c : composing) c.dispose();
    }
}

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        print("Creating " + this);
    }

    public void addRef() {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) print("Disposing " + this);
    }

    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    public static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        print("disposing " + this);
        shared.dispose();
    }

    public String toString() {
        return "Composing " + id;
    }
}
