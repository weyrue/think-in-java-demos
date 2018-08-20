package com.thinkInJava.Chapter5;

public class DefaultConstructor {
    public static void main(String[] args) {
        DefaultConstructorPractice a = new DefaultConstructorPractice();
        DefaultConstructorPractice b = new DefaultConstructorPractice("abc");

        Dog d = new Dog();
        d.bark('s');
        d.bark(0xc);

        d.bark(2.3, 'g');
        d.bark('f', 3.3);

//        NonConstructor n1;
        NonConstructor n2 = new NonConstructor();

//        System.out.println(n1.a + " " + n1.b);
        System.out.println(n2.a + " " + n2.b);

    }

}

class DefaultConstructorPractice {
    String str;

    public DefaultConstructorPractice(String str) {
        this.str = str;
        System.out.println(str + " is Created!");
    }

    public DefaultConstructorPractice() {
        System.out.println("Created!");
    }
}

class Dog {
    public void bark(char a) {
        System.out.println("Barking!");
    }

    public void bark(double a) {
        System.out.println("Howling!");
    }

    public void bark(char a, double b) {
        System.out.println("Barking! Barking!");
    }

    public void bark(double a, char b) {
        System.out.println("Howling! Howling!");
    }

}

class NonConstructor {
    int a = 1;
    int b;
}
