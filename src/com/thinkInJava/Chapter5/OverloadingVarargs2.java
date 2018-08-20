package com.thinkInJava.Chapter5;

public class OverloadingVarargs2 {
    public static void main(String[] args) {
        f(1.1f, 'a');
//        f('a', 'b');
    }

    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(Character... args) {
        System.out.println("second");
    }
}
