package com.thinkInJava.Chapter6;

public class ABCConstructorTest {
    public static void main(String[] args) {
        // write your code here
        new C();
    }
}

class A {
    A() {
        System.out.println("A Constructor.");
    }
}

class B {
    B() {
        System.out.println("B Constructor.");
    }
}

class C extends A {
    private B b = new B();

    C() {
        System.out.println("C Constructor.");
    }
}
