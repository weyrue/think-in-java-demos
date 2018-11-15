package com.thinkInJava.Chapter15;

public class GenericMethods {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("", 1, gm);
//        gm.f(1);
//        gm.f(1.0);
//        gm.f(1.0F);
//        gm.f('c');
//        gm.f(gm);

    }

    public <A, B, C> void f(String x, B y, C z) {
        System.out.println(x.getClass().getName());
        System.out.println(y.getClass().getName());
        System.out.println(z.getClass().getName());
    }
}
