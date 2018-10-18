package com.thinkInJava.Chapter12;

public class WhoCalled {
    public static void main(String[] args) {
        f();
        System.out.println("--------------------------");
        g();
        System.out.println("--------------------------");
        h();
    }

    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace())
                System.out.println(ste.getMethodName());
        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }
}
