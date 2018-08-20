package com.thinkInJava.Chapter5;

public class ExplicitStatic {
    public static void main(String[] args) {
//        System.out.println("Inside main()");
//        Cups cups1 = new Cups();
//        Cups.cup1.f1(99);

        Cups.printStaticParameters();
    }

}

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f1(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2 = new Cup(2);

    static {
        cup1 = new Cup(1);
//        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }

    static void printStaticParameters() {
        cup1.f1(101);
        cup2.f1(102);
    }
}