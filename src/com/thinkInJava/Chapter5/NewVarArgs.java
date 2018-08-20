package com.thinkInJava.Chapter5;

public class NewVarArgs {
    public static void main(String[] args) {
        printArray(new Integer(47), new Float(3.14), new Double(11.11));
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
        printArray((Object[]) new Integer[]{1, 2, 3, 4});
        printArray();

        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
    }

    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println(" length: " + args.length);
    }

    static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println(" length: " + args.length);
    }
}

class A {
}

