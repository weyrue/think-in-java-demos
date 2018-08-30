package com.thinkInJava.Chapter9;

public class Music4 {
    public static void main(String[] args) {
//        Instrument2 i = new Instrument2();
        new TestPrint().print();
    }

}

abstract class Instrument {

    abstract void play();

    void adjust() {

    }
}

abstract class Instrument2 {

    void play() {

    }

    void adjust() {

    }
}

abstract class TestPrintBase {
    abstract void print();

    TestPrintBase() {
        System.out.println("TestPrintBase");
        print();
    }
}

class TestPrint extends TestPrintBase {

    private int i = 1;
    private boolean flag = true;
    private String s = "sss";

    @Override
    void print() {
        System.out.println(i);
        System.out.println(flag);
        System.out.println(s);
    }

    public TestPrint() {
        System.out.println("TestPrint");
    }
}

abstract class NoMethodAbstractClass {

}

class ClassFromNoMethod extends NoMethodAbstractClass {
    public void printInfo() {
        System.out.println("Msg from ClassFromNoMethod.");
    }

    public static void downCast(NoMethodAbstractClass noMethodAbstractClass) {
        ClassFromNoMethod classFromNoMethod = (ClassFromNoMethod) noMethodAbstractClass;
        downCast(classFromNoMethod);
    }
}

