package com.thinkInJava.Chapter6;

public class ABCConstructorTest {
    public static void main(String[] args) {
        // write your code here
//        new C(3);
        
        new C();
    }
}

class A {
    A() {
        System.out.println("A Constructor.");
    }

    A(int i) {
        System.out.println(i + " + A Constructor.");
    }
}

class B {
    B() {
        System.out.println("B Constructor.");
    }

    B(int i) {
        System.out.println(i + " + B Constructor.");
    }
}

class C extends A {
    private B b = new B(2);

    C() {
//        super(1);
        System.out.println("C Constructor.");
    }

    C(int i) {
        super(1);
        System.out.println(i + " + C Constructor.");
    }
}
