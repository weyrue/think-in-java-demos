package com.thinkInJava.Chapter12;

public class NeverCaught {
    public static void main(String[] args) {
        g();
    }

    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
    }
}
